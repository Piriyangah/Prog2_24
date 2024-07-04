package kv_TicTacToe_020724;

public class TicTacToeSpiel {
    State[][] feld;
    public TicTacToeSpiel() {
        feld = new State[3][3];               // generieren Spielfeld von 9 Zellen
        for (int zeile = 0; zeile < 3; zeile++) {       // Zeile 0,1,2
            for (int spalte = 0; spalte < 3; spalte++) {// spalgte 0,1,2
                feld[zeile][spalte] = State.EMPTY;      // soll leer sein
            }
        }
    }
    public void spielt(int zeile, int spalte, State spieler){ //spielen
        if(feld[zeile][spalte] == State.EMPTY){ // wenn die Zelle leer ist
            feld[zeile][spalte] = spieler;      // dann soll der Spieler gespeichert werden
        }
    }
}
