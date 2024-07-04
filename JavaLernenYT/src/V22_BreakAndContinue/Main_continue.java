package V22_BreakAndContinue;
/*
 * Labels:
 * continue:
 */
public class Main_continue {
    public static void main(String[] args)
    {
        System.out.printf("%nCONTINUE: überspringt den durchlauf in der es sich befindet" +
                "%n---> Beispiel: Summieren von Werten die alle größer als 100 sind " +
                "(geht durch den Array und überspingt alles was nicht größer als 100 ist)<---%n");
        int[] number = {124, 62, 521, 13, 512, 95, 745};    // Array mit Elementen
        int sum = 0;                                        // summe mit 0 initialisieren

        for (int i : number) {                              // laufe durch den Array
            if(i <= 100){                                   // wenn kleiner als 100
                continue;                                   // überspringe
            }
            System.out.println(i + " wurde hinzugefügt");    // gebe die Zahl und den Text aus
            sum += i;                                        // und dann diese mit der neuen Zahl addieren
        }

        // Beispiel 2:
        System.out.printf("%n---> Weiter bsp für continue <---%n"); // 
        for (int i = 0; i < 12; i++) {
            if(i==5){                                               // Überspringen, wenn i 5 entspricht
                System.out.print(" ");
                continue;                                           // da wo 5 sein sollte wurde übersprungen und
            }                                                       // stattdessen eine zeilenumbruch gemacht
            System.out.print(i);                                    // dann
        }
        System.out.println();

        System.out.printf("%n---> Beispiel mit Objekten <---%n");
        String[] strings = new String[5];                           // 5 Objekte in Array erstellen
        strings[0] = "Du";                                          // Objekte speichern
        strings[2] = "Bist";
        strings[4] = "Hamma";
        /*
         * Konsole:
         * Du
         * null
         * Bist
         * null
         * Hamma
         */
        // null ist der Standardwert, wenn es da keinen Wert sind

        for (String string : strings) {
            if(string == null){ // filtern; null dann überspringen
                continue;
            }
            System.out.print(string + " ");
        }
    }
}
