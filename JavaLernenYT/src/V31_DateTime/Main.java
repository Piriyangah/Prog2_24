package V31_DateTime;
// alles nur mit Imports
// nicht benötigte Imports mit Strg+alt+o wird gelöscht
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        // Datum - Format: 2024-05-18
        LocalDate date = LocalDate.of(2024, Month.MAY, 18);
        System.out.println(date);


        // Zeit - Format: 16:55:30
        LocalTime time = LocalTime.of(16,55,30);
        System.out.println(time);

        // Datum und Zeit Format: 1990-08-04T13:22:30
        LocalDateTime ldt = LocalDateTime.of(1990,Month.AUGUST,04,13,22,30);
        System.out.println(ldt);


        // weiter Methoden dazu:
        // - eine exakt genau zeit der ausgabe
        LocalDateTime ldt2 = LocalDateTime.now();
        System.out.println(ldt2);

        // Zukunft Zeit von jetzt
        LocalDateTime ldt3 = ldt2.plusMonths(5).plusDays(3).minusSeconds(20);
        // - exakt 5 Monate, 3 Tage von ldt2 in zukunft minus 20 Sekunden liegen soll
        //   .plusXXX() = Zukunft
        //   .minusXXX() = Vergangengheit

        // Testen, ob es ein Schaltjahr ist
        // - die Methode gibt es nur in LocalDate-Klasse und nicht in LocalDateTime
        //   also Klassen umwandeln
        System.out.println(ldt3.toLocalDate().isLeapYear()); //gibt true oder false

        // zwei Datum vergleichen
        System.out.println(ldt.isBefore(ldt2)); // ldt vor ldt2?
        System.out.println(ldt.isAfter(ldt2)); // ldt nach ldt2?
        System.out.println(Duration.between(ldt2,ldt3).toDays()); // Wieviele Tage zwischen ldt und ldt2?
        System.out.println(Duration.between(ldt2,ldt3).toSeconds()); // Wieviele Sekunden zwischen ldt und ldt2?

        // Zeit richtig formatieren und ausgaben
        // - Format: 04 08 90
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM YY");
        System.out.println(formatter.format(ldt));

        // - Format: 04 Aug. 1990
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(formatter2.format(ldt));

        // - Format: 04/Aug./1990
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(formatter3.format(ldt));

        // - Format (mit Wochentag): Samstag 04. Aug. 1990
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE dd. MMM yyyy");
        System.out.println(formatter4.format(ldt));

        // - Format (mit Wochentag): Samstag, 04. August 1990
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("EEEE, dd. MMMM yyyy");
        System.out.println(formatter5.format(ldt));

        // - Format (mit Wochentag + Uhrzeit): Samstag, 04. August 1990 13:22:30
        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("EEEE, dd. MMMM yyyy H:m:s");
        System.out.println(formatter6.format(ldt));

        // - Format (mit Wochentag + Uhrzeit + AM/PM): Samstag, 04. August 1990 13:22:30 PM
        DateTimeFormatter formatter7 = DateTimeFormatter.ofPattern("EEEE, dd. MMMM yyyy H:m:s a");
        System.out.println(formatter7.format(ldt));

        // - Format (in anderen Sprache): samedi, 04. août 1990
        DateTimeFormatter formatter8 = DateTimeFormatter.ofPattern("EEEE, dd. MMMM yyyy").withLocale(Locale.FRANCE);
        System.out.println(formatter8.format(ldt));
    }
}
