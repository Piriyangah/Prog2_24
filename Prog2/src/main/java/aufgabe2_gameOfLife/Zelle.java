package aufgabe2_gameOfLife;

public enum Zelle {
    LEBENDIG ('*'), TOT ('.');

    char symbol;

    private Zelle(char c) { //WARUM GEHT PUBLIC FÜR KONSTRUKTOR ????
        this.symbol = c;
    }

    public Zelle erstellenVonNaechsteGeneration(int anzahlNachbar){
        if(this == Zelle.LEBENDIG){    //Wenn die Zelle bereits LEBENDIG ist
            // WARUM GEHT this.symbol NICHT??? --> eine bestimmt Objekt
            if (anzahlNachbar == 2 || anzahlNachbar == 3) {
                return Zelle.LEBENDIG;
            }
            else{
                return Zelle.TOT;
            }
        }
        else { //Wenn die Zelle bereits TOT ist
            if(anzahlNachbar == 3){
                return Zelle.LEBENDIG;
            }
            else {
                return Zelle.TOT;
            }
        }
    }
}
