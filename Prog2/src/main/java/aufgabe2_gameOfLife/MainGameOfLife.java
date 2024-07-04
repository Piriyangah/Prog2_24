package aufgabe2_gameOfLife;

public class MainGameOfLife {

    public static void main(String[] args) {
        System.out.println("Game of Life");
        Spielablauf spielablauf1 = new Spielablauf();
        spielablauf1.simuliereGenerationen(6);
    }
}
