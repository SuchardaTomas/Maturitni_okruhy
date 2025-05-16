package Vyjimky;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Vyjimka{
        Scanner sc = new Scanner(System.in);

        // dělení nulou
        // try {
        //     int a = 5;
        //     int b = 0;
        //     System.out.println(a / b);
        // } catch(ArithmeticException e) {
        //     e.printStackTrace();
        // }

        // Input chyba
        // try {
        //     System.out.println("zadejte číslo");
        //     int num = sc.nextInt();
        // } catch (InputMismatchException e) {
        //     e.printStackTrace();
        // }

        // špatný index
        // try {
        //     int[] arr = {1, 2, 3};
        //     System.out.println(arr[3]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     e.printStackTrace();
        // }

        int věk = 5;

        if (věk < 18) {
            throw new Vyjimka();
        } else {
            System.out.println("Můžete vstoupit");
        }


    }
}
