package Vetveni;

import java.util.Scanner;

public class Trojuhelnik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadejte výšku trojúhelníku: ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
