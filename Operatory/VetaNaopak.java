package Operatory;

import java.util.Scanner;

public class VetaNaopak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadejte větu: ");
        String veta = sc.nextLine();

        String vysledek = "";

        for (int i = veta.length()-1; i >= 0; i--) {
            vysledek += veta.charAt(i);
        }

        System.out.println("Nová věta: " + vysledek);
    }
}
