package V21_ForEachSchleife;

//For-each - um Datenstrickturen auszulesen

/*
 * Wichtigste Unterschiede for-each, fori:
 *
 * For-each:
 *  -> Am Besten um Datenstrukturen auszulesen (Arrays, Listen)
 *  -> Übersichtlicher als fori-Schleife
 *  -> Keine Veränderung möglich, da nur Kopie gespeichert
 *
 * Fori:
 *  -> Verwendung, wenn es um die ZÄHLVARIABLE geht
 *  -> Wenn man seinen Code x mal durchlaufen will
 *  -> Sehr schreibintensiv!
 *
 */

public class Main {
    public static void main(String[] args) {
        int[] numbers = {123,1254,61312, 1235, 234};
        /* for (int i = 0; i < numbers.length; i++) { }
         * int i ist hier eine Zielvariable
         * sie wird als 0 bestimmt und e
         */

        //hier ist int i keine Zielvariable, sondern speichert direkt die Werte die in der array erhalten sind
        for (int i: numbers){
            System.out.println(i);
        }

        String[] words = {"Under", "my", "umbrella", "ella", "eh", "eh"};

        for(String merke : words){
            merke ="BlaBla";
            System.out.println(merke);
            //wird einfach die werte von merke, welche auch nur eine kopie von words sind, überschrieben
            //deswegen kommt in der nächsten ausgabe dann auch wieder die ursprüngliche werte
        }

        for(String speichern : words){
            System.out.println(speichern);
        }

        Mitarbeiter[] mitarbeiterArray ={
                new Mitarbeiter("Peter", 25, 30000,"1234"),
                new Mitarbeiter("Lisa", 56, 70000,"haustiere"),
                new Mitarbeiter("HAns", 43, 50000,"passwort")
        };

        for(Mitarbeiter mitarbeiter: mitarbeiterArray){
            System.out.println(mitarbeiter.namen);
        }

    //Automatisch generieren von For-schlreifen bzw. ausgaben von inhalte von Arrays:
        //mitarbeiterArray.for
        for (Mitarbeiter mitarbeiter : mitarbeiterArray) {
        }
        //mitarbeiterArray.fori
        for (int i = 0; i < mitarbeiterArray.length; i++) {
        }
        //mitarbeiterArray.forr
        for (int i = mitarbeiterArray.length - 1; i >= 0; i--) {
        }
        //eine feste Länge von array mit 12.fori oder forr
        for (int i = 0; i < 12; i++) {
        }
    }
}
