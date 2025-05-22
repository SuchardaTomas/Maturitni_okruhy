package Kolekce;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Jmena {
    public static void main(String[] args) {

        Set<String> jmena = new HashSet<>();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte 6 jmén");

        for (int i = 0; i < 6; i++) {
            System.out.print("Zadej jméno: ");
            String jmeno = sc.nextLine();
            jmena.add(jmeno);
        }

        System.out.println("Zadaná jména: ");
        for (String jmeno : jmena) {
            System.out.print(jmeno + ", ");
        }
    }
}
