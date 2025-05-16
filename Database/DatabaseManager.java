package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseManager {
    public static void getData() throws SQLException {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        PreparedStatement statement = cn.prepareStatement("SELECT * FROM animals");
        ResultSet set = statement.executeQuery();

        while (set.next()) {
            System.out.println(set.getInt("id"));
            System.out.println(set.getString("name"));
            System.out.println(set.getString("race"));
            System.out.println(set.getString("color"));
            System.out.println(set.getInt("age"));
        }
    }

    public static void setData(String name, String race, String color, int age) throws SQLException {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        PreparedStatement statement = cn.prepareStatement("INSERT INTO users VALUES (NULL, ?, ?, ?, ?)");

        statement.setString(1, name);
        statement.setString(2, race);
        statement.setString(3, color);
        statement.setInt(3, age);
        statement.execute();
    }

    public static void getDataRace() throws SQLException {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        PreparedStatement statement = cn.prepareStatement("SELECT * FROM animals WHERE race = ?");
        ResultSet set = statement.executeQuery();

        while (set.next()) {
            System.out.println(set.getInt("id"));
            System.out.println(set.getString("name"));
            System.out.println(set.getString("race"));
            System.out.println(set.getString("color"));
            System.out.println(set.getInt("age"));
        }
    }



}