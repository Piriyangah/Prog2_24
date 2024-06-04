import java.util.Random;

public class Kartenspiel {

	enum Farbe {KREUZ, PIK, HERZ, KARO};
	enum Wert {SIEBEN(7), ACHT(8), NEUN(9), ZEHN(10), BUBE(10), DAME(10), KOENIG(10), ASS(11); 
	//enum ist eine Klasse mit Objeketen. Diese wird jedoch als Datentyp betrachtet.
		private int wert; 
        private Wert(int wert) {
            this.wert = wert;
        }
    }

    public static class Spielkarte {

        
        public Spielkarte() {
            Random r = new Random();
            int randomNr1 = r.nextInt(4);
            int randomNr2 = r.nextInt(8);
            
            Farbe[] farbwerte = Farbe.values();
            
            String s ="";
            for (int i = 0; i < Farbe.values().length; i++) {
                if(randomNr1 == i) {
                    s += Farbe.values()[i];
                }
            }
            
            for (int j = 0; j < Wert.values().length; j++) {
                if (randomNr2 == j) {
                    s += ", " + Wert.values()[j];
                }
            }
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Spielkarte s1 = new Spielkarte();
        Spielkarte s2 = new Spielkarte();
        Spielkarte s3 = new Spielkarte();
        Spielkarte s4 = new Spielkarte();
    }
}