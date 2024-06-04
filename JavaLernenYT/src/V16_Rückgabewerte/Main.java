package V16_Rückgabewerte;
/*
 * Rückgabetyp ist immer ein Datentyp
 * - es muss nicht immer was ausgegeben werden (void) sondern einfach nur rechnen geht auch
 * - man kann auch in main die Methode aufrufen und die Werte nicht dirket printen sondern in andern Variable speichern
 * -> Pro: Code verallgemeinern und ....
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(plusRechnen(12,4));
        int summe = plusRechnen(12,4);

        System.out.println(bitteHinzufügen("Kann ich das haben"));

        //alle Hunde die nur durch alter unterscheiden
        Hund hund1 = hunErstellen(1);
        Hund hund2 = hunErstellen(4);
        Hund hund3 = hunErstellen(6);
        Hund hund4 = hunErstellen(2);


        Taschenrechner t1 = new Taschenrechner();
        int produkt = t1.mal(3,14);
        int subtrahieren = t1.subtrahieren(produkt,256);
        int summen = t1.addieren(subtrahieren,25);
        System.out.println(summen);

        //Was auch geht aber unübersichtlich ist
        System.out.println(t1.addieren(t1.subtrahieren(t1.mal(3,14),256),25));
    }

    public static int plusRechnen(int zahl1, int zahl2){
        int summe = zahl1 + zahl2;
        return summe; //return zahl1 +zahl2; geht auch
    }

    public static String bitteHinzufügen(String s){
        return s + ", bitte";
    }

    public static Hund hunErstellen(int alter){
        //erstelle Objekte (Hunde) gleicher Art, farbe und so bis aud alter
        return new Hund(alter,"Laprador", "weiß",false);
    }
}
