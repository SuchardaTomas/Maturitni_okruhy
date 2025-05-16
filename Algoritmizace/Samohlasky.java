package Algoritmizace;
import java.util.Scanner;

public class Samohlasky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String samohlasky = "aeiouyáéěíóůúý";
        int pocet_samohlasek = 0;

        System.out.println("Zadejte větu: ");
        String veta = sc.nextLine().trim().toLowerCase();

        for (int i = 0; i < veta.length(); i++) {
            char samohlaska = veta.charAt(i);
            if (samohlasky.indexOf(samohlaska) != -1) {
                pocet_samohlasek++;
            }
        }

        System.out.println("Počet samohlásek: " + pocet_samohlasek);
    }
}
