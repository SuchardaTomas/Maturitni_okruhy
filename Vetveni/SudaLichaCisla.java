package Vetveni;

import java.util.Scanner;

public class SudaLichaCisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadejte první číslo: ");
        int num1 = sc.nextInt();

        System.out.println("Zadejte druhé číslo: ");
        int num2 = sc.nextInt();

        System.out.println("Zadejte třetí číslo: ");
        int num3 = sc.nextInt();

        if(num1 % 2 != 0 && num2 % 2 != 0 && num1 % 2 != 0) {
            System.out.printf("Čísla %d, %d, %d spadají do skupiny lichá čísla", num1, num2, num3 );
        } else if(num1 % 2 != 0 || num2 % 2 != 0 || num1 % 2 != 0) {
            System.out.printf("Čísla %d, %d, %d spadají do skupiny lichá i sudá čísla", num1, num2, num3 );
        } else {
            System.out.printf("Čísla %d, %d, %d spadají do skupiny sudá čísla", num1, num2, num3 );
        }
    }
}
