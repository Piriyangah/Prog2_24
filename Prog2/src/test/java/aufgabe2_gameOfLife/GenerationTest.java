package aufgabe2_gameOfLife;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
/*
TESTEN NUR PUBLIC METHODEN, WEIL DIE IN PUBLIC METHODEN MITGESTESTET WERDEN
- auf File und dann auf die TestFile [...]  und auf "Run 'Test' with Coverage" klicken
 */

public class GenerationTest {
//Prüfen von Konstuktor bzw Erstellen von Spielfeld
    @Test // Lebendige Zelle Prüfen
    public void initialisierenZeile1Spalte1Lebendig(){
        Generation lebeding = new Generation(6);
        assertEquals(Zelle.LEBENDIG, lebeding.zustand[1][1]);
    }

    @Test // Tote Zelle Prüfen
    public void initialisierenZeile3Spalte3Tot(){ //prüfen, dass in (3,3) lebendig
        Generation tot = new Generation(6); //ist die Größe von Spielfeld
        assertEquals(Zelle.TOT, tot.zustand[3][3]); //greifen auf die verschachtelte Array auf den Ort Zeile 3 und Spalte 3
    }



    @Test // die Größe des Speilfeld testen; Methode hat Zellen die leben die bei kleiner Felder nie erreicht werden
    public void initialisierenGroesse3Zeile1Spalte1Lebendig(){
        Generation zustand = new Generation(3);
        assertEquals(Zelle.LEBENDIG, zustand.zustand[3][4]);
        // Test richtig, aber Methode falsche, weil Groesse 3 ist zu klein,
        // weil die [3,4] soll lebendig sein, aber das geht nicht, weil das Feld klein ist
    }


// nächste Generation
    // es ist ein Test auf einen Methode mit void als Rückgabewert.
    // Also können wir den result nicht wirklich vergleiche
    @Test //1 lebendiger Nachbar - stirbt [1,1]
    public void erstelleNaechsteGenerationZeile1Spalte1Stirbt(){
        Generation zustand = new Generation(6);
        zustand.erstelleNaechsteGeneration(); //rufen die Methode einmal auf; können es auch nicht speichern, weil es void zurückgibt
        assertEquals(Zelle.TOT, zustand.zustand[1][1]);
    }

    @Test //2 lebende Nachbarn - bleibt tot [1,0]
    public void erstelleNaechsteGenerationZeile1Spalte0bleibtTot(){
        Generation zustand = new Generation(6);
        zustand.erstelleNaechsteGeneration();
        assertEquals(Zelle.TOT, zustand.zustand[1][0]);
    }

    @Test //2 lebende Nachbarn - bleibt lebendig [2,1]
    public void erstelleNaechsteGenerationZeile2Spalte1Lebtweiter(){
        Generation zustand = new Generation(6);
        zustand.erstelleNaechsteGeneration();
        assertEquals(Zelle.LEBENDIG, zustand.zustand[2][1]);
    }

    @Test //3 lebende Nachbarn - wird lebendig [2,3]
    public void erstelleNaechsteGenerationSpalte2Zeile3WirdLebendig(){
        Generation zustand = new Generation(6);
        zustand.erstelleNaechsteGeneration();
        assertEquals(Zelle.LEBENDIG, zustand.zustand[2][3]);
    }

    @Test //3 lebende Nachbarn - bleibt lebendig [2,5] und dann [2,4]
    public void erstelleNaechsteGeneration2MalZeile4Spalte2Lebtweiter(){
        Generation zustand = new Generation(6);
        zustand.zustand[2][5] = Zelle.LEBENDIG; //beleben eine Zelle
        zustand.erstelleNaechsteGeneration();
        assertEquals(Zelle.LEBENDIG, zustand.zustand[2][4]);
    }

    @Test //4 lebende Nachbarn - stirbt [2,5] dann [3,5] und dann [2,4]
    public void erstelleNaechsteGenerationSpalte2Zeile4Nachbarn(){
        Generation zustand = new Generation(6);
        zustand.zustand[2][5] = Zelle.LEBENDIG; //beleben zwei Zellen
        zustand.zustand[3][5] = Zelle.LEBENDIG;
        zustand.erstelleNaechsteGeneration();
        assertEquals(Zelle.TOT, zustand.zustand[2][4]);
    }

    @Test //4 lebende Nachbarn - bleibt tot [3,3] und dann [2,3]
    public void erstelleNaechsteGenerationSpalte3Zeile2Nachbarn(){
        Generation zustand = new Generation(6);
        zustand.zustand[3][3] = Zelle.LEBENDIG; //beleben zwei Zellen
        zustand.erstelleNaechsteGeneration();
        assertEquals(Zelle.TOT, zustand.zustand[2][3]);
    }

// istImArray Methode testen



}