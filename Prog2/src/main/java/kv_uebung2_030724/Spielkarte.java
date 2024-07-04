package kv_uebung2_030724;

import java.util.Random;

public class Spielkarte {

    public Kartenfarbe kartenfarbe;
    public Kartenwertigkeit kartenwertigkeit;

    public Kartenfarbe gibZufälligeFarbe(){
        Kartenfarbe[] kartenfarben = Kartenfarbe.values(); //die Werte die es möglich sind in Arrays speichern
        int anzahlMengeDerFarben = kartenfarben.length;
        Random random = new Random();
        int index = random.nextInt(anzahlMengeDerFarben);
        return kartenfarben[index];
    }

    public Kartenwertigkeit gibZufälligesWert(){
        Random random = new Random();
        return Kartenwertigkeit.values()[random.nextInt(Kartenwertigkeit.values().length)];
    }


    public Spielkarte() {
    }
}
