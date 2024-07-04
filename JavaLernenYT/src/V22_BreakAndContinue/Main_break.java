package V22_BreakAndContinue;
// nicht viel anders zu continue
//break bricht den Vorgang ab

import java.util.Random;

public class Main_break {
    public static void main(String[] args) {
        // Beispiel 1:
        System.out.printf("%nBREAK: überspringt den durchlauf in der es sich befindet, wie CONTINUE auch" +
                "%n---> Beispiel: gehe die Schleife durch und brich ab, sobald in der Schleife eine 5 auftaucht%n" +
                "(Bei Continue war es etwas anders)<---%n%n");

        for (int i = 0; i < 12; i++) {          // dasselbe wie das Beispiel von Continue, aber bricht, dann die Schleife und nicht nur den Vorgang
            if(i==5){                           // sobald 5=5
                break;                          // durchlauf der Schleife stoppen
            }
            System.out.print(i);              // gibt die Zahlen aus
        }


        //Beispiel 2:
        System.out.printf("%n%n----> Beispiel 2: Soll zufällig 3 mal 6 ausgegeben werden; wenn das erreicht ist dann die Ausführung stoppen <---- %n%n");

        Random random = new Random();                               // zufalls Zahl-Obj
        int counter = 0;                                            // eine Zählvariable
        while(true){                                                // solange es "true"
            int i = random.nextInt(10);                      // eine zufällige Zahl von 0 bis 9 in i speichern

            if (i == 6){                                            // wenn i 6 ist, dann
                counter++;                                          // den Zählvariable (Z.27) um 1 erhöhen
                System.out.println(counter + ". mal eine " + i);    // den counter mit Text und 6 ausgeben
                if (counter == 3){                                  // wenn counter 3 erreicht
                    break;                                          // soll der Ablauf gestoppt werden
                }
            }
            System.out.println("Schade, leider keine 6: " + i);     // immer wenn i nicht zufällig 6 ist, dann soll der Text mit der gewürfelten Zahl ausgegeben werden
        }
    }
}
