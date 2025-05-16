package Operatory;

import java.util.Scanner;

public class Rovnice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 1;

        System.out.println("Zadejte hodnotu y do rovnice x + y = 1");
        int num = sc.nextInt();

        System.out.println("Zadané číslo: " + num);

        System.out.println("Vaše rovnice: x = " + (result-num));
        

    }
}
