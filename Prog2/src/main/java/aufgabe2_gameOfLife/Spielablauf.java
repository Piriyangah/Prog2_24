package aufgabe2_gameOfLife;

public class Spielablauf {

    private Generation generation;

    public Spielablauf(){
        generation = new Generation(10);
    }

    public void simuliereGenerationen(int anzahlGeneration){
        generation.zeichnen();
        for (int index = 0; index < anzahlGeneration; index++) {
            generation.naechsteGeneration();
            System.out.println("");
            generation.zeichnen();
        }
    }
}
