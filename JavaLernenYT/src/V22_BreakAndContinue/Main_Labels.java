package V22_BreakAndContinue;
//Label: man benennt die schleifen und sagt dann mit der name, welche
//       genau abgebrochen werden sollen
//       - Labels sind

import java.util.Random;

public class Main_Labels {
    public static void main(String[] args) {
        // Beispiel 1:
        System.out.printf("%nLOOPS: In einer Endlosschleife mit einer for-schleife drin soll," +
                "sobald die Bedingung eingetroffen ist, soll nicht nur der For-Schleife sonder auch die while-Schleife gestoppt werden <---%n%n");

        System.out.printf("%n----> Beispiel 1: Wenn eine 6 als Zufallszahl kommt, dann diese abbrechen <---%n%n");

        /*
         *  while(true){                         // Endlose Schleife
         *   for (int i = 0; i < 10; i++) {      // geht die Schleife durch
         *       if(i == 6){                     // sobald i 6 ist
         *           break;                      // soll die For-Schleife gestoppt werden
         *       }
         *       System.out.println(i);          // solange gib alle Zahlen aus
         *   }
         *
         *   // Bricht aber die while-Schleife nicht ab nur die For-Schleife.
         *   // Ohne abbruch geht es dann immer weiter
         *   // !!!! Break bricht nur der inneren Schleife !!!!
         */

        // Bessere Variante:
        loop: while(true) {                      // Endlose Schleife
            for (int i = 0; i < 10; i++) {      // geht die Schleife durch
                if (i == 6) {                     // sobald i 6 ist
                    break loop;              // den continue stoppen
                }
                System.out.print(i);          // gibt alle i's aus bis 6 = 6 eintrifft
            }
        }
        System.out.printf("%n");

        // Beispiel 2: 10 x einen 1 Würfeln
        System.out.printf("%n----> Beispiel 2: 10 mal eine 1 Würfeln <---%n%n");
        Random random = new Random();                   // Zufallszahlen
        forLoop: for (int i = 0; i < 10; i++) {         // äußere Schleife = 10-mal
            whileLoop: while(true){                     // solange true
                int i2 = random.nextInt(100);    // eine Zufallszahl von 0 bis 99 zuweisen
                if(i2 == 1){                            // wenn diese 1 ist
                    System.out.println("Erfolgreich");  // gibt Text aus
                    //break whileLoop;                  // Opt1: innere Schleife beenden
                    continue forLoop;                   // Opt2: äußere Schleife weiterführen
                }
            }
        }
    }
}
