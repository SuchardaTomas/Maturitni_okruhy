package Cykly;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadejte kolik čísel chcete vypsat: ");
        int num = sc.nextInt();

        int current = 0;
        int previous = 1;


        System.out.print("Výsledek: ");
        for (int i = 0; i < num; i++) {
            current = previous + current;
            previous = current - previous;

            System.out.print(previous + " ");
        }
    }
}
