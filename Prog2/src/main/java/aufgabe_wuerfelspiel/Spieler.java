package aufgabe_wuerfelspiel;

public class Spieler extends Spielablauf {
    private int punktestand;

    public Spieler(){
        this.punktestand=0;
    }

    public int getPunktestand() {
        return this.punktestand;
    }

    public int PunktestandErhoehen(){
        return this.punktestand += versuch();
    }
}
