package Datum_cas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte datum narození (RRRR-MM-DD)");
        String datumNarozeni = sc.nextLine();
        LocalDate narozeni = LocalDate.parse(datumNarozeni);
        LocalDate dnesDatum = LocalDate.now();

        Period rozdil = Period.between(narozeni, dnesDatum);
        System.out.println("Od narození uběhlo " + rozdil.getYears() + " let, " + rozdil.getMonths() + " měsíců, " + rozdil.getDays() + " dní\n");


        System.out.println("Zadejte čas začátku vaší zkoušky (HH:MM)");
        String casZkousky = sc.nextLine();
        LocalTime zacatekZkousky = LocalTime.parse(casZkousky);
        LocalTime dnesCas = LocalTime.now();

        Duration delka = Duration.between(zacatekZkousky, dnesCas);
        System.out.println("Od začátku zkoušky uplynulo: " + delka.toMinutes() + " minut\n");

        LocalDateTime datumCas = LocalDateTime.now();
        System.out.println(datumCas.format(DateTimeFormatter.ofPattern("MM//LLL//LLLL - EEEE//d - YYYY")));
        
    }
}
