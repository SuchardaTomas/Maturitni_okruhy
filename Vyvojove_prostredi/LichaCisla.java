package Vyvojove_prostredi;

import java.util.Scanner;

public class LichaCisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cisla = new int[10];
        int soucet = 0;

        for (int i = 0; i < cisla.length; i++) {
            System.out.println("Zadejte " + (i + 1) + ". číslo:");
            cisla[i] = sc.nextInt();
        }

        System.out.print("\nZadaná čísla: ");
        for (int cislo : cisla) {
            System.out.print(cislo + ", "); 
            
            if(cislo % 2 != 0) {
                soucet += cislo;
            }
        }

        System.out.println("\nSoučet lichých čísel: " + soucet);
    }
}
