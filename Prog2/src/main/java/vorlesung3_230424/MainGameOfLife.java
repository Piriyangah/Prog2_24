package vorlesung3_230424;

public class MainGameOfLife {

    /*
    Game of Live (Spiel)
    Spielregeln:
    1) Lebendige Zelle weniger als 2 Lebenden Nachbarn  => tot
    2) lebende Zelle mit 2 oder 3 Nachbarn              => lebendig
    3) lebende Zelle mit mehr als 3 lebenden Nachbarn   => tot
    4) tote mit 2 lebenden Nachbarn                     => lebendig

    Idee:
    Klassen:
    - Zelle
    - Generation Spielfeld
   -  Steuerung Spiel
     */

     public static void main(String[] args) {
          System.out.println("Game of Life");
          Spielablauf spielablauf = new Spielablauf();
          spielablauf.simuliereGenerationen(10);
     }
}
