package V26_ZweidimensionaleArrays;
/*
 * Array:
 * - mit Array kann man mehrer Informationen von einer Datentyp speichern
 *
 *
 * Zwei-/Mehrdimensionale Arrays:
 * - Alles was ma in Tabelen darstellen kann, kann man auch damit darstellen
 * - zu Reihen jeweilige Spalten
 * - alles was bei der initialierung von den Array ist nur die länge der ersten Reihe relevant,
 *   was in der 2. Arrray passiert intressiert nicht, es kann egal wie lang sein,
 *   nur es muss den gleiche Datentyp haben
 */

public class Main {
    public static void main(String[] args) {

        // Array Bsp:
        String[] arbeitstage = {"Monatag", "Dienstag", "Mittwoche", "Donnerstag", "Freitag"};

        //wir wollen mehr informationen zu den einzelnen Arbeitstag speichern mit Zweidimensionale Array
        String[][] arbeitstageMitInfos = {      //1. Array
                {"Montag", "1", ":(("},         //2. Array
                {"Dienstag", "2", ":("},
                {"Mittwoch", "3", ":|"},
                {"Donnerstag", "4", ":)"},
                {"Freitag", "5", ":))"},

        };

        //dreidimensionale Arrays - Bsp Würfel
        int[][][] wuerfel = new int[3][3][3]; //länge, höhe, tiefe

        //dreieckige Array
        int [][] array = new int[5][]; //nur die Länger der ersten ist wichitg
        System.out.println(array.length); // gibt die länge von array, welches die Länge 5 hat

        for (int i = 0; i < array.length ; i++) {
            array[i] = new int[i+1];  //1 Array hat länge 0+1=1, 2 Array hat länge 1+1=2 usw
        }

        //Zweidiemsionale Array initialisieren und auslesen:
        char[][] chars = new char[50][50];
        for (int i = 0; i < chars.length; i++) {
            for (int i1 = 0; i1 < chars.length; i1++) {
                chars[i][i1] ='#';
            }
        }
        System.out.println(chars[2][3]); //eine Zelle auslesen

        //auslesen von kompletten Arrays
        for (int i = 0; i < chars.length; i++) {
            for (int i1 = 0; i1 < chars.length; i1++) {
                System.out.print(chars[i][i1] + "\t"); //Tab hinzugefügt um die Werte auch in Tabelle zuzeigen
            }
            System.out.println();
        }

        //Mulitplikationstabelle erstellen
        //initialisieren
        int[][] multTable = new int[10][10];
        for (int i = 0; i < multTable.length; i++) { //automatisch generieren von For-Schleife: multTable.length.fori
            for (int i1 = 0; i1 < multTable.length; i1++) {
                multTable[i][i1] = (i+1) * (i1 +1);
            }
        }
        //ausgabe
        for (int i = 0; i < multTable.length; i++) { //automatisch generieren von For-Schleife: multTable.length.fori
            for (int i1 = 0; i1 < multTable.length; i1++) {
                System.out.print(multTable[i][i1] + "\t"); //automatisch geneieren: multTable[i][i1].sout
            }
            System.out.println();
        }

        // wenn man jetzt die Rechnung dazu mit angeben möchte
        //initialisieren
        String[][] multTableKomplett = new String[10][10];
        for (int i = 0; i < multTableKomplett.length; i++) { //automatisch generieren von For-Schleife: multTable.length.fori
            for (int i1 = 0; i1 < multTableKomplett.length; i1++) {
                multTableKomplett[i][i1] = (i + 1) + "x" + (i1 + 1) + " = " + (i+1) * (i1 +1);
            }
        }
        //ausgabe
        for (int i = 0; i < multTableKomplett.length; i++) { //automatisch generieren von For-Schleife: multTable.length.fori
            for (int i1 = 0; i1 < multTableKomplett.length; i1++) {
                System.out.print(multTableKomplett[i][i1] + "\t"); //automatisch geneieren: multTable[i][i1].sout
            }
            System.out.println();
            System.out.println();
        }






    }
}
