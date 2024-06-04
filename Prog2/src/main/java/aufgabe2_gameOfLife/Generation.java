package aufgabe2_gameOfLife;

public class Generation {
    Zelle[][] startZustand;

    public Generation (int laenge){
        this.startZustand = new Zelle[laenge][laenge];
        //hier wurde die Methode erstellenVonSpielfeld() noch erwähnt
    }

    public void erstellenVonSpielfeld(){
        for (int zeile = 0; zeile < this.startZustand.length; zeile++) {
            for (int spalte = 0; spalte < this.startZustand[0].length; spalte++) {
                this.startZustand[zeile][spalte] = Zelle.TOT;
            }
        }
        this.startZustand[1][1] = Zelle.LEBENDIG;
        this.startZustand[2][1] = Zelle.LEBENDIG;
        this.startZustand[3][1] = Zelle.LEBENDIG;
        this.startZustand[1][4] = Zelle.LEBENDIG;
        this.startZustand[2][4] = Zelle.LEBENDIG;
        this.startZustand[3][4] = Zelle.LEBENDIG;
        this.startZustand[4][4] = Zelle.LEBENDIG;
    }

    public boolean imArray(int nachbarZeile, int nachbarSpalte){
        return nachbarZeile >= 0
                && nachbarSpalte >= 0
                && nachbarZeile < this.startZustand.length
                && nachbarSpalte < this.startZustand.length;
    }

    public boolean istNachbar(int zeile, int spalte, int nachbarZeile, int nachbarSpalte){
        return nachbarZeile != zeile || nachbarSpalte != spalte;
                //!(nachbarZeile == zeile && nachbarSpalte == spalte);
        //nachbarZeile != zeile || nachbarSpalte != spalte;
    }

    public int anzahlLebendigenNachbarnErmitteln(int zeile, int spalte){
        int aktuellLebendigenNachbarn = 0;
        int nachbarZeile;
        int nachbarSpalte;
        for (int kontrollZeile = -1; kontrollZeile <= 1; kontrollZeile++) {
            for (int kontrollSpalte = -1; kontrollSpalte <= 1; kontrollSpalte++) {
                nachbarZeile = zeile + kontrollZeile;
                nachbarSpalte = spalte + kontrollSpalte;
                if(this.imArray(nachbarZeile,nachbarSpalte)){
                    if(this.istNachbar(zeile,spalte,nachbarZeile,nachbarSpalte)){
                        if(this.startZustand[nachbarZeile][nachbarSpalte]==Zelle.LEBENDIG){
                            aktuellLebendigenNachbarn++;
                        }
                    }
                }
            }
        }
        return aktuellLebendigenNachbarn;
    }

    public void naechsteGeneration(){
        Zelle[][] naechsteGeneration = new Zelle[this.startZustand.length][this.startZustand.length];
        int anzahlLebendigenNachbarn;
        for (int zeile = 0; zeile < this.startZustand.length; zeile++) {
            for (int spalte = 0; spalte < this.startZustand.length; spalte++) {
                anzahlLebendigenNachbarn = this.anzahlLebendigenNachbarnErmitteln(zeile,spalte);
                Zelle zelleInDerAktuellenGeneration = this.startZustand[zeile][spalte];
                Zelle zelleInDerNaechstenGeneration = zelleInDerAktuellenGeneration.erstellenVonNaechsteGeneration(anzahlLebendigenNachbarn);
                naechsteGeneration[zeile][spalte] = zelleInDerNaechstenGeneration;
            }
        }
        this.startZustand = naechsteGeneration;
    }

    public void zeichnen(){
        for (int zeile = 0; zeile < this.startZustand.length; zeile++) {
            for (int spalte = 0; spalte < this.startZustand.length; spalte++) {
                System.out.print(this.startZustand[zeile][spalte].symbol);
            }
            System.out.println("");
        }
        System.out.println();
    }

}
