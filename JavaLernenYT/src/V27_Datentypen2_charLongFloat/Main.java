package V27_Datentypen2_charLongFloat;
/*
 * Datentypen:
 * - Bisher gelernt: int, double, boolean
 * - dürfen nicht beliebig groß sein, hab eine Feste max größe, da sie als Byte bzw Bits gespeichert werden
 * - jeder Datentyp hat eine Größe
 * - 1 Byte hat 8 Bits und Bit ist die kleinste Einheit von Computer, die entwerden den Wert 0 oder 1 annehmen können
 *   also das sind 8 Bits -> 00000000 = s^8 Möglichkeiten = 256 darin kann man unseren int Werte zB speichern
 * - Datentyp byte = verbrauch 1 Byte verbrauch
 * - Datentyp short = verbrauch 2 Byte verbrauch (16 Bit)
 * - Datentyp int = verbrauch Byte verbrauch ()
 * - Datentyp long = verbrauch 8 Byte verbrauch (64 Bit) mit L kennzeichnen
 *
 * - Datentyp char = ein einziges Zeichen speichern
 *
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        byte b = 32; // funktioniert nur für kleine Zahlen, mit weniger Speicherplatz
        short s = 1245;
        int i = 1329358;
        long l = 31551616154615151L;

        char c = 'f';
        String string = "word"; //eigentlich kein primitiver Datentyp; es ist eigentlich eine Klasse, aber man kann einfcher schreiben ohne new String()

        float f = 15.123578f; //eine f hinterzahl setzten!
        double d = 134.1415;
        boolean bool = true;

        //prüfen, was der größte Zahl von int ist
        int i2 = Integer.MAX_VALUE;
        System.out.println(i2);


        //TypeCasting Typumwandlung:
        //Upcasting - passieren automatisch
        short s2 = b;   //short ist größer als byte
        long l2 = i;    //long größer als int
        double d2 = f;  //double größer als float

        //Downcasting
        float f2 = (float) d; //d ist noch so klein, sodass es in float passt
        System.out.println(f2);

        //ACHTEN DAS ES DIE WERTE IN DEN DATENTYPEN PASST!!!!
        int i3 = (int) l; //Long Wert ist zu groß für int
        System.out.println(i3); //419183983 es kommt eine andere Zahl raus


    }
}
