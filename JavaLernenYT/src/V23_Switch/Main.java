package V23_Switch;

import java.util.Random;
import java.util.Scanner;

/*  Switch: -
 *        - man muss aktive break schreiben nach jedem case, weil es sonst alle anderen folgenden cases mit printet
 *        - aufbau ist ähnlich zu while-Schleife
 *        - Wenn man mehr als 2 Fälle nach werten testen möchte, benutzt man statt if/else dann switch
 *        - es muss immer ein default-code geschieben werden, falls der code fehlerhaft sein sollte und es nie zu den cases kommt
 *    switch(PrüfVariable mit der es getestet werden soll, keine Bedingung wie bei while){
 *          case 1: "Enter"
 *              "sout"+"Enter";
 *              case 2: "Enter" - rückt automatisch rein
 *              break;
 *              ....
 *          default:
 *              ....
 *
 *  Switch-case:
 *  switch(variable){
 *      case wert1:
 *          // Code
 *      case wert2:
 *          // Anderen Code
 *      case wert3:
 *          // wieder anderen Code
 *  }
 *
 */

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int wuerfel = random.nextInt(6) + 1;
        // int wuerfel = random.nextInt(6)-100;  // test für default Fall

        switch (wuerfel) { // zu prüfende Variable
            case 1:
                System.out.println("Du hast eine Eins gewürfelt...: :((");
                break;
            case 2:
                System.out.println("Du hast eine Zwei gewürfelt...: :(");
                break;
            case 3:
                System.out.println("Du hast eine Drei gewürfelt...: :/");
                break;
            case 4:
                System.out.println("Du hast eine View gewürfelt...: :|");
                break;
            case 5:
                System.out.println("Du hast eine Fünf gewürfelt...: :)");
                break;
            case 6:
                System.out.println("Du hast eine Sechs gewürfelt...: :))");
                break;
            default:
                System.out.println("Komischer Wert: " + wuerfel); // ist grau, weil es nicht benutzt wird; aber wenn es jetzt möglich wäre, dann würde es ausgeführt
        }

    /* so geht auch, aber besser ist mit switch
        if (wuerfel == 1){
            System.out.println("Du hast eine Eins gewürfelt...: :((");
        } else if (wuerfel == 2) {
            System.out.println("Du hast eine Zwei gewürfelt...: :(");
        } else if (wuerfel == 3) {
            System.out.println("Du hast eine Drei gewürfelt...: :/");
        } else if (wuerfel == 4) {
            System.out.println("Du hast eine View gewürfelt...: :|");
        } else if (wuerfel == 5) {
            System.out.println("Du hast eine Fünf gewürfelt...: :)");
        } else if (wuerfel == 6) {
            System.out.println("Du hast eine Sechs gewürfelt...: :))");
        } else {
            System.out.println("Keine Ahnung was du da gewürfelt hast...");
        }
    */

        System.out.printf("%n%n Beispiel 2: Es soll aus mehreren Noten den Durchschnitt ausgeben %n");

        Scanner scan = new Scanner(System.in);
        int note = scan.nextInt();
        String ergebnis;

        switch (note){
            case 1:
                ergebnis = "Dein Durchschnitt ist sehr gut";

        }


    }

}
