package Komentare;

/**
 * @author Tomáš Sucharda
 * @version 1.0
 */
public class Animal {

    /**
     * Metoda, která simuluje běh zvířete na danou vzdálenost. 
     * @param distance vzdálenost v kilometrech, kterou zvíře uběhne
     */
    public void run(double distance) {
        System.out.println("Zvíře běží " + distance + " kilometrů.");
    }

    /**
     * Metoda, která simuluje spánek zvířete.
     */
    public void sleep() {
        System.out.println("Zvíře spí.");
    }

    /**
     * Metoda, která simuluje jezení zvířete.
     */
    public void eat() {
        System.out.println("Zvíře jí.");
    }

    /**
     * Metoda vrací zvuk, který zvíře vydává.
     * @return řetězec reprezentující zvuk zvířete
     */
    public String sound() {
        return "Zvuk zvířete";
    }
}
