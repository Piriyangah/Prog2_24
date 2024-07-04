package kv_TicTacToe_020724;

public enum State {
    EMPTY(0),X(1),O(2);

    public int Wert;

    public int getWert() {
        return Wert;
    }
    private State(int wert) {
        this.Wert = wert;
    }
}
