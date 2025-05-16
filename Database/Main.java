package Database;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vyberte operaci \n1)Přidat zvíře \n2)Zobrazit všechna data \n3) Zobrazit všechna zvířata podle rasy");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Zajdete jméno zvířete");
                String name = sc.nextLine();
                System.out.println("Zadejte rasu zvířete");
                String race = sc.nextLine();
                System.out.println("Zadejte barvu zvířete");
                String color = sc.nextLine();
                System.out.println("Zadejte věk zvířete");
                int age = sc.nextInt();

                try {
                    DatabaseManager.setData(name, race, color, age);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            case 2 -> {
                try {
                    DatabaseManager.getData();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            case 3 -> {
                try {
                    DatabaseManager.getDataRace();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
