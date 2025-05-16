package Algoritmizace;
import java.util.Scanner;

public class Obdelnik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte výšku obdélníku");
        int vyska = sc.nextInt();
        
        int delka = vyska * 2;
        int stred = delka / 2 - 1;

        //vrchní část
        for (int i = 0; i < delka; i++) {
            System.out.print("*");
        }
        System.out.println();

        //střední část
        for (int i = 0; i < vyska - 2; i++) {
            System.out.print("*"); 

            for (int j = 0; j < delka - 2; j++) {
                if (j == stred) {
                    System.out.print("*"); 
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("*"); 
        }

        // spodní část
        for (int i = 0; i < delka; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}