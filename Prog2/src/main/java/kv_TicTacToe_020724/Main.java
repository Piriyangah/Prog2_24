package kv_TicTacToe_020724;

public class Main {
    public static void main(String[] args) {
        TicTacToeSpiel spiel1 = new TicTacToeSpiel();
        spiel1.spielt(0,0,State.X);
        spiel1.spielt(2,1,State.O);

        System.out.println(spiel1 + "Spielläuft"); // wird nicht ausgegeben
        System.out.println("Spielläuft");
    }

}
