package aufgabe2_gameOfLife;

public class Generation {
    Zelle[][] zustand;

    public Generation (int laenge){
        this.zustand = new Zelle[laenge][laenge];
        erstellenVonSpielfeld();
    }

    public void erstellenVonSpielfeld(){
        for (int zeile = 0; zeile < this.zustand.length; zeile++) {
            for (int spalte = 0; spalte < this.zustand[0].length; spalte++) {
                this.zustand[zeile][spalte] = Zelle.TOT;
            }
        }
        this.zustand[1][1] = Zelle.LEBENDIG;
        this.zustand[2][1] = Zelle.LEBENDIG;
        this.zustand[3][1] = Zelle.LEBENDIG;
        this.zustand[1][4] = Zelle.LEBENDIG;
        this.zustand[2][4] = Zelle.LEBENDIG;
        this.zustand[3][4] = Zelle.LEBENDIG;
    }

    public boolean istImArray(int nachbarZeile, int nachbarSpalte){
        return nachbarZeile >= 0
                && nachbarSpalte >= 0
                && nachbarZeile < this.zustand.length
                && nachbarSpalte < this.zustand.length;
    }

    public boolean istNachbar(int zeile, int spalte, int nachbarZeile, int nachbarSpalte){
        return nachbarZeile != zeile || nachbarSpalte != spalte;
                //!(nachbarZeile == zeile && nachbarSpalte == spalte);
        //nachbarZeile != zeile || nachbarSpalte != spalte;
    }

    private int anzahlLebendigenNachbarnErmitteln(int zeile, int spalte){
        int aktuellLebendigenNachbarn = 0;
        for (int kontrollZeile = -1; kontrollZeile <= 1; kontrollZeile++) {
            for (int kontrollSpalte = -1; kontrollSpalte <= 1; kontrollSpalte++) {
                int nachbarZeile = zeile + kontrollZeile;
                int nachbarSpalte = spalte + kontrollSpalte;
                if(this.istImArray(nachbarZeile,nachbarSpalte)){
                    if(this.istNachbar(zeile,spalte,nachbarZeile,nachbarSpalte)){
                        if(this.zustand[nachbarZeile][nachbarSpalte]==Zelle.LEBENDIG){
                            aktuellLebendigenNachbarn++;
                        }
                    }
                }
            }
        }
        return aktuellLebendigenNachbarn;
    }

    public void erstelleNaechsteGeneration(){
        Zelle[][] naechsteGeneration = new Zelle[this.zustand.length][this.zustand.length];
        for (int zeile = 0; zeile < this.zustand.length; zeile++) {
            for (int spalte = 0; spalte < this.zustand.length; spalte++) {
                // anzahl der Nachbarn zählen
                int anzahlLebendigenNachbarn = this.anzahlLebendigenNachbarnErmitteln(zeile,spalte);
                // Zelle nach nächsten Status fragen
                Zelle zelleInDerAktuellenGeneration = this.zustand[zeile][spalte];
                Zelle zelleInDerNaechstenGeneration = zelleInDerAktuellenGeneration.erstellenVonNaechsteGeneration(anzahlLebendigenNachbarn);
                naechsteGeneration[zeile][spalte] = zelleInDerNaechstenGeneration;
            }
        }
        this.zustand = naechsteGeneration;
    }

    public void zeichnen(){
        for (int zeile = 0; zeile < this.zustand.length; zeile++) {
            for (int spalte = 0; spalte < this.zustand.length; spalte++) {
                System.out.print(this.zustand[zeile][spalte].symbol);
            }
            System.out.println("");
        }
        System.out.println();
    }
}