package Pole;

public class Jmena {
    public static void main(String[] args) {
        String[] jmena = { "Radek", "Pavel", "Jan", "Jirka", "Radim", "Karla", "Marie", "Eva", "Jaroslav", "Vojta" };
        String samohlasky = "aeiouyAEIOUY";

        // pracuje se na tom
        // jména, která obsahují jenom samohlásku a
        

        System.out.println("\n");

        // jména, která končí na samohlásku
        for (String jmeno : jmena) {
            char posledniZnak = jmeno.charAt(jmeno.length() - 1);
            if (samohlasky.indexOf(posledniZnak) != -1) {
                System.out.print(jmeno + ", ");
            }
        }

        System.out.println("\n");

        // jména, která nekončí na samohlásku
        for (String jmeno : jmena) {
            char posledniZnak = jmeno.charAt(jmeno.length() - 1);
            if (samohlasky.indexOf(posledniZnak) == -1) {
                System.out.print(jmeno + ", ");
            }
        }

        System.out.println("\n");

        // jména, která jsou delší než tři písmena
        for (int i = 0; i < jmena.length; i++) {
            if (jmena[i].length() > 3) {
                System.out.print(jmena[i] + ", ");
            }
        }

        System.out.println("\n");

        // každé druhé jméno
        for (int i = 0; i < jmena.length; i++) {
            if (i % 2 == 0) {
                System.out.print(jmena[i] + ", ");
            }
        }

    }
}
