package Kolekce;

import java.util.Scanner;
import java.util.Stack;

public class Cisla {
    public static void main(String[] args) {
    
        Stack<Integer> cisla = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte 7 čísel");

        for (int i = 0; i < 7; i++) {
            System.out.print("Zadejte číslo: ");
            int cislo = sc.nextInt();
            cisla.push(cislo);
        }

        System.out.println("\n");

        System.out.println("Odebírání čísel (LIFO)");
        while (!cisla.isEmpty()) {
            System.out.println("Odebráno: " + cisla.pop());
        }
    }
}
