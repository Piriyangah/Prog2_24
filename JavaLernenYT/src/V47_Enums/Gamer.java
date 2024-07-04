package V47_Enums;

public class Gamer {
    private int score;
    // private String difficulty;       // gibt die Schwierigkeitsgrad an
    private Schwierigkeit difficulty;   // Datentyp soll Schwierigkeit sein

    public Gamer() {
        this.score = 0;
        this.difficulty = Schwierigkeit.LEICHT;
    }

    //public String getDifficulty() {
    public Schwierigkeit getDifficulty() { // Typ Schwierigkeit
        return difficulty;
    }

}
