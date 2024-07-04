package V47_Enums;

public class MainGamer {
    public static void main(String[] args) {
        Gamer gamer1 = new Gamer();
       // String difficulty = gamer1.getDifficulty();
        Schwierigkeit difficulty = gamer1.getDifficulty(); // Muss auch hier geändert werden
        if(difficulty.equals("Leicht")){
            // Leichtes Spiel starten
        } else if (difficulty.equals("Mittel")) {
            //Mittelschweres Spiel starten
        }

        /* Der code oben funktioniert, aber schlechter Code
        -> Fehleranfällig
        -> schlechter Code-Style
        -> der User gibt was e
         */

        // In realität würde also wie gefolgt aus:
        switch ((gamer1.getDifficulty())){ // Jedes der möglichen Fälle/Werte werden einzeln betracht
            case LEICHT:
                // Code für leichtes Spiel
            case MITTEL:
                // Code für mittelschweres Spiel
            case SCHWER:
                // Code für schweres Spiel
            case EXTEM:
                // Code für extrem schweres Spiel

        }
    }
}
