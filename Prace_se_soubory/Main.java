package Prace_se_soubory;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File f = new File("Prace_se_soubory/animals.txt");

        try {
            if (f.createNewFile()) {
                System.out.println("Složka se vytvořila");
            } else {
                System.out.println("Složka se nevytvořila");
            }
        } catch(IOException e) {
            e.printStackTrace();
        }


        try (FileWriter writer = new FileWriter("Prace_se_soubory/animals.txt")){
            writer.write("Max\r\nPerrito");
        } catch(IOException e) {
            e.printStackTrace();
        }

        try (FileReader reader = new FileReader("Prace_se_soubory/animals.txt")){
            int character;
            while ((character = reader.read()) != -1) {
                System.out.println((char) character);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
