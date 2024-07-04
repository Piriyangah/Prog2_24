package V11_Methoden;

import java.net.StandardSocketOptions;
/*
 * Methoden: - sind Funktionen
 *           - müssen einzigartig sein
 *           - mehrere gleichnamige Methoden, dann müssen diese durch Parameter zumindest unterscheiden
 *           -
 */
public class V11_Methode {
    public static void main(String[] args) {
        System.out.format("%n%nVideo 11 - Methoden in Java %n");
        // Methode: ein Bestandteil von einer Klasse in der man Code schreiben kann
        // Ausgeführt wird nur der Code der in Main steht
        // Code von anderen Methode, dann muss die Methode in Main aufgerufen werden

        // shift+F6 kann man Methodenname für alle Anwendungen verändern

        briefKopf();
        System.out.println("........... Briefinhalt............");

        int x = 5;
        int y = 3;
        addieren(x,y);
        addieren(5,7);
        subtrahieren(5,7);
        multiplizieren(5,7);
        dividieren(5,7);
    }

    public static void briefKopf(){
        System.out.println("Max Mayer");
        System.out.println("Wohnort 123");
        System.out.println("12345 PLZ");
        System.out.println("Tel.....");
        System.out.println();
        System.out.println();
    }

    public  static void addieren(int zahl1, int zahl2){
        int summe = zahl1 + zahl2;
        System.out.println(summe);
    }

    public  static void subtrahieren(int zahl1, int zahl2){
        int differenz = zahl1 - zahl2;
        System.out.println(differenz);
    }

    public static void multiplizieren(int zahl1, int zahl2){
        int produkt = zahl1 * zahl2;
        System.out.println(produkt);
    }

    public static void dividieren(int zahl1, int zahl2){
        int quotient = zahl1 / zahl2;
        System.out.println(quotient);
    }
}
