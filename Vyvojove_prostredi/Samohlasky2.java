package Vyvojove_prostredi;

import java.util.Scanner;

public class Samohlasky2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String samohlasky = "aeiouy";
        String vystup = "";

        System.out.println("Zadejte větu: (bez diakritiky)");
        String veta = sc.nextLine().toLowerCase();

        System.out.println("Vstup: " + veta);

        for (int i = 0; i < veta.length(); i++) {
            char samohlaska = veta.charAt(i);
            if (samohlasky.indexOf(samohlaska) == -1) {
                vystup += samohlaska;
            }
        }
        System.out.print("Výstup: " + vystup);

    }
}
