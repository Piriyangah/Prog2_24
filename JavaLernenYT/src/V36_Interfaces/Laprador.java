package V36_Interfaces;
/*
 so wie Superklassen überschreiben,
 aber nicht mit "extend" sondern "implements"
 */
public class Laprador implements HundInterface {
    int alter;
    String name;
    String farbe;

    public Laprador(int alter, String name, String farbe) {
        this.alter = alter;
        this.name = name;
        this.farbe = farbe;
    }

    @Override // überschreibt die Methode aus der HundeInterface
    public void belle() {
        System.out.println("Wuff Wuff");
    }

    @Override
    public void fressen() {
        System.out.println("Mampf Mampf");
    }
}
