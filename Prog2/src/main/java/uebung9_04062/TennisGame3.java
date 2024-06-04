package uebung9_04062;/*
public class TennisGame3 implements TennisGame {
    
    private int pointsOfPlayer1; //p2
    private int pointsOfPlayer2;
    private String player1Name; //p1N
    private String player2Name;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String s;
        if (pointsOfPlayer2 < 4 && pointsOfPlayer1 < 4 && !(pointsOfPlayer2 + pointsOfPlayer1 == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"}; 
            s = p[pointsOfPlayer2];
            return (pointsOfPlayer2 == pointsOfPlayer1) ? s + "-All" : s + "-" + p[pointsOfPlayer1];
        } else {
            if (pointsOfPlayer2 == pointsOfPlayer1)
                return "Deuce";
            s = pointsOfPlayer2 > pointsOfPlayer1 ? player1Name : player2Name;
            return ((pointsOfPlayer2 -pointsOfPlayer1)*(pointsOfPlayer2 -pointsOfPlayer1) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }
    
    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.pointsOfPlayer2 += 1;
        else
            this.pointsOfPlayer1 += 1;
        
    }

}


 */