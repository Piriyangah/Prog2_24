package aufgabe6_Test;

import static aufgabe6_Test.Teeparty.Stimmung.GREAT;

public class Teeparty {

    // TODO schreibe Test
    // denke über Edgecases nach
    // erreiche 100% Coverage
    public Stimmung getTeePartyStimmung(int tee, int kuchen) {
        if (tee < 5 || kuchen < 5) { //weniger als 5 Tee oder Kuchen
            return Stimmung.BAD;
        }
        if (tee * 2 <= kuchen || kuchen * 2 <= tee) { //Tee doppelt weniger als Kuchen oder Kuchen doppelt mehr als Tee
            return GREAT;
        }
        return Stimmung.GOOD; //sonst nur good
    }

    public enum Stimmung {
        BAD, GOOD, GREAT
    }
}



