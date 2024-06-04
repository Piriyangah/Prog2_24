package V15_Konstruktor;
/*
 * Konstuktor:
 * - braucht keinen Rückgabetypen
 * - heißt gleich wie die Klasse
 * - initialisiert ganze Objekte
 * - in Main werden Werte in der Klammer von Konstuktor übergeben, welche
 * dann die Werte zu den Attribute von der Klasse (Hund) übergeben wird
 */

public class Hund {
    //Attribute
    int alter;
    String art;
    String fellfarbe;
    boolean kannPfoteGeben;

    //Konstuktor
    public Hund(int alter, String art, String fellfarbe, boolean kannPfoteGeben){
        this.alter = alter;
        this.art = art;
        this.fellfarbe = fellfarbe;
        this.kannPfoteGeben = kannPfoteGeben;
    }

    public void bellen(String bell){                            // 4. die bellen() wird ausgeführt
        System.out.println(bell);                               // 5. hier wird es ausgegeben
    }

    public void testmethode(boolean kannBellen, String bell){   // 1.
        if(kannBellen){                                         // 2. da true
            bellen(bell);                                       // 3. die belle() mit bell als Parameter übergeben
        }
    }

    public void plusRechnen(int zahl1, int zahl2, int zahl3){
        System.out.println(zahl1 + zahl2 + zahl3);
    }

}
