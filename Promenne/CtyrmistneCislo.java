package Promenne;

import java.util.Scanner;

public class CtyrmistneCislo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadejte číslo: ");
        String number = sc.nextLine();

        int vysledek = 1;

        if (number.length() == 4) {
            for (int i = 0; i < number.length(); i++) {
                int cislice = Character.getNumericValue(number.charAt(i));

                vysledek *= cislice;

                System.out.println("Výsledek: " + vysledek);
            }
        } else {
            System.out.println("Musí se zadat čtyřmístné číslo");
        }

        
    }
}
