package Kolekce;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> jmena = new HashSet<>();
        Collections.addAll(jmena, "Radek", "Pavel", "Radek", "Jan", "Petr", "Jan");

        System.out.println("Jména:");
        for (String jmeno : jmena) {
            System.out.print(jmeno + ", ");
        }

        System.out.println("\n");

        Queue<String> idk = new LinkedList<>();
        idk.add("A");
        idk.add("B");
        idk.add("C");

        while (!idk.isEmpty()) {
            System.out.println("Odebírám: " + idk.poll());
        }


    
    }
}
