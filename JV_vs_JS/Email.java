package JV_vs_JS;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte Váš email: ");
        String email = sc.nextLine();

        System.out.println("Zadejte Vaše heslo");
        String password = sc.nextLine();

        System.out.println("Váš email: " + email);
        System.out.println("Vaše heslo k emailu: " + password);
    }
}
