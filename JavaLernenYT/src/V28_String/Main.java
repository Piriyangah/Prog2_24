package V28_String;

import java.util.Arrays;

/*
 * String:
 * - kein primitiver Datentyp; es ist eine eigene Klasse
 * - Es ist ein (Kette) Array von chars
 * - eine
 */
public class Main {
    public static void main(String[] args) {
        String string = "Das ist ein String";
        String string2 =  "Das ist ein String";

        //Stringa vergleichen
       // System.out.println(string == string2); //kontrolliert nur ob es in der selbern Ort gespeichert wird
        System.out.println(string.equals(string2)); // hier kontrolliert es zeichen für zeichen

        //String prüfen, ob sie die Eingegebene Zeichenkette enthält
        System.out.println(string.contains("ist ein"));
        System.out.println(string.contains("ist. ein"));

        //String start mit und ende mit kontrollieren
        System.out.println(string.startsWith("Das"));
        System.out.println(string.endsWith("ing"));

        //Strings in Großbuchstaben/ Kleinbuchstaben ausgeben
        System.out.println(string.toUpperCase()); //gibt ein kopierte String in alles groß zurück
        System.out.println(string.toLowerCase()); //gleich nur alles klein

        //gibt die Zeichen zurück die im index 12 gespeichert ist
        System.out.println(string.charAt(12));

        //gibt den index zurück wo das (i) Zeichen gespeichert ist
        System.out.println(string.indexOf("ist"));
        System.out.println(string.indexOf("s"));  // erste Stelle wo es den Zeichen findet
        System.out.println(string.indexOf("k")); //gibt -1 dann nicht im string vorhanden

        //gibt die letzte stelle wo diese Zeichen auftaucht
        System.out.println(string.lastIndexOf("i"));

        //gibt eine array zurück in dem es überall wo diese Zeichen (Leerzeichen) wird es gesplitet oder auch regex
        System.out.println(Arrays.toString(string.split(" "))); //gibt array aus

        //StringBuilder-Klasse: benutzt wenn viel mitstring passiert
        //fassen Array ELement zu einem String
        StringBuilder builder = new StringBuilder();
        String[] array = {"Das", " ist", " kein", " String", " Array"};
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
        }
        String s = builder.toString();
        System.out.println(s);





    }
}
