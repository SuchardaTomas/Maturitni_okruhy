package Promenne;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Zadejte vaši výšku v metrech: ");
        double height = sc.nextDouble();

        System.out.print("Zadejte vaši váhu v kologramech: ");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("Vaše BMI je %.2f \n", bmi);

        if(bmi < 18.5) {
            System.out.println("Kategorie BMI: podváha");
        } else if(bmi >= 18.5 && bmi <= 24.99) {
            System.out.println("Kategorie BMI: optimální váha");
        } else if(bmi >= 25 && bmi <= 29.99) {
            System.out.println("Kategorie BMI: nadváha");
        } else if(bmi >= 30 && bmi <= 34.99) {
            System.out.println("Kategorie BMI: obezita prvního stupně");
        } else if(bmi >= 35 && bmi <= 39.99) {
            System.out.println("Kategorie BMI: obezita druhého stupně");
        } else {
            System.out.println("Kategorie BMI: obezita třetího stupně");
        }

    }
}
