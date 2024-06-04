package V32_Vererbung;
/*
 * 1 Superklasse kann mehrere Unterklassen haben
 * - durch "extends Lebewesen" (erbt) erweitert die Pflanze die eigenschaften von Lebewesen
 *
 */
public class Main {
    public static void main(String[] args) {
        Lebewesen lw1 = new Lebewesen();
        lw1.fortPflanzen();

        //Unterklasse greift auch Methode der Superklasse (Lebewesem) zu
        Tier t1 = new Tier();
        t1.fortPflanzen();
        t1.macheGeräusch(); // methode aus Klasse Tier (Unterklasse)

        Hund h1 = new Hund(11, "Husky", "Braun", false);
        h1.fortPflanzen(); //Methode aus Lebewesen (Lebewesen<-Tier<-Hund)


    }
}
