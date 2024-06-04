package V25_Printf;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;

/*
 * Es gibt Unicode 2^16 ~ 65000 Zeichen in Java
 * Wo: unter Suchleiste von Windows -> "Zeichentabelle" schreiben
 * unter System.out.println("\ u UndDannDenCoder")
 *
 * Printf
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        //Sonderzeichen: \ u ...
        System.out.println("\u00AE");  // This will print the registered trademark symbol (®)
        System.out.println("Der Bruch \u00BC ist kleiner als der Bruch \u00BE");

        //Absatz: \n
        System.out.println("Das ist ein Absatz: \nUnd hier eine neue Zeiel");

        //Tab: \t
        System.out.println("Das ist ein Tab: \t Und hier eine neue Zeiel");

        String name = "Peter";
        int alter = 32;
        double gehalt = 56000.14;

        //println
        System.out.println("Unser Mitarbeiter " + name + " ist " + alter + " jahre alt und verdient " + gehalt + " im Jahr.");

        //printf
        System.out.printf("Unser Mitarbeiter %s ist %d jahre alt und verdient %.2f im Jahr.\n", name, alter, gehalt);

        /*
         * printf
         * \n - Absatz machen
         * %S - macht alle Zeichen in Großbuchstabem
         * %8 - macht lücken und hält platzfrei, hier für 8 zeichen
         * %.2f - rundent nach Komma 2 Stellen = 56000.14
         * %10.2f = hält 10 Zeichen frei =    56000.14
         * %010.2f = füllt die leerstellen mit 0 = 0056000.14
         * wenn statt , (Komma) . (Punkt) sein soll, dann so wie in beispiel Local importieren
         */
         System.out.printf(Locale.US,"Unser Mitarbeiter %S ist %5d jahre alt und verdient %10.2f im Jahr.\n", name, alter, gehalt);




    }
}
