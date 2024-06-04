package V24_KonditionelleOperatoren;
/*
 * Konditionelle/Ternäre Operatoren:
 *
 * AUFBAU:
 * boolean (Bedingung) ? (der Wert der zurückgegebn werden soll wenn wahr) : (der Wert der zurückgegebn werden soll wenn false)
 *
 * Nachteil: man kann als Rückgabe nur Variablen oder Datentype zurückgeben,
 *           man kann keine Methodenaufrufe oder Code mit mehrere Zeilen
 */

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static String upper(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        // If Schreibweise:
        String message = "Hello Computer";
        if(message.startsWith("Hello")){
            System.out.println("Hey");
            //Man kann hier Methode1 aurufen
        } else {
            System.out.println("Weiß ich nicht...");
            //Man kann hier Methode2 aurufen
        }

        // Konditionelle Opertoren Schreibweise:
        String response = message.startsWith("Hello") ? "Hey" : "Weiß ich nicht ...";
        System.out.println(response);

        // ODER direkt so geht auch:
        System.out.println(message.startsWith("Hello") ? "Hey" : "Weiß ich nicht ...");

        // Methoden kann man nicht als Wert eingeben:
        // geht nicht weil, System.out.println() ein void als Rückgabetyp hat und "Weiß ich nicht ..." ist ein String
        // String response = message.startsWith("Hello") ? System.out.println("Hey"); : "Weiß ich nicht ...";
        // System.out.println(response);

        // wenn die Methode jedoch einen Wer ausgibt, welches für wahr und false definiert wurde, geht das:
        String s = message.startsWith("Hello") ? upper("Hey") : "Weiß ich nicht ..."; //hier gibt upper() einen String aus und nach : steht auch ein String
        System.out.println(response);


        //----- nächstes Beispiel:

        // wenn es mehr als 2 Ausgaben geben kann
        //hier wenn kleiner, gleich, und größer als 4
        // wenn i kleiner als 4, dann gib "Kleiner als 4"
        // : (sonst) wenn i gleich 4, dann gib "Gleich 4"
        // : (sonst) "Größer als"

        int i1 = 3;
        int i2 = 4;
        int i3 = 5;

        System.out.println(i1 < 4 ? "Kleiner als 4" : i1 == 4 ? "Gleich 4" : "Größer als 4");
        System.out.println(i2 < 4 ? "Kleiner als 4" : i2 == 4 ? "Gleich 4" : "Größer als 4");
        System.out.println(i3 < 4 ? "Kleiner als 4" : i3 == 4 ? "Gleich 4" : "Größer als 4");

        // Taschenrechner Testen
        int a = 4;
        int b = -6;

        System.out.println(Taschenrechner.max(a,b) + " ist der größere Zahl");
        System.out.println(Taschenrechner.abs(a) + " ist die absolute Wert von " + a);
        System.out.println(Taschenrechner.abs(b) + " ist die absolute Wert von " + b);












    }

}
