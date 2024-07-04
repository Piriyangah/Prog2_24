package aufgabe2_gameOfLife;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ZelleTest {
    //Lebendig - 2 Nachbaren - lebendig bleiben
    @Test
    public void lebendig2LebendeNachbarenBleibtlebendig(){
        Zelle zustand = Zelle.LEBENDIG.erstellenVonNaechsteGeneration(2);
        assertEquals(Zelle.LEBENDIG, zustand); //assertEquals(ErwarterWert, wandRauskommt)
    }

    ///Lebendig - 3 Nachbaren - lebendig bleiben
    @Test
    public void lebendig3LebendeNachbarenBleibtlebendig(){
        Zelle zustand = Zelle.LEBENDIG.erstellenVonNaechsteGeneration(3);
        assertEquals(Zelle.LEBENDIG, zustand);
    }

    ///Lebendig - 1 Nachbar - stirbt
    @Test
    public void lebendig1LebendeNachbarSirbt(){
        Zelle zustand = Zelle.LEBENDIG.erstellenVonNaechsteGeneration(1);
        assertEquals(Zelle.TOT, zustand);
    }

    ///Lebendig - 4 Nachbaren - stirbt
    @Test
    public void lebendig4LebendeNachbarSirbt(){
        Zelle zustand = Zelle.LEBENDIG.erstellenVonNaechsteGeneration(4);
        assertEquals(Zelle.TOT, zustand);
    }

    //Tot - 3 Nachbaren - wird lebendig
    @Test
    public void tot3LebendeNachbarlebendig(){
        Zelle zustand = Zelle.TOT.erstellenVonNaechsteGeneration(3);
        assertEquals(Zelle.LEBENDIG, zustand);
    }

    //Tot - 4 Nachbaren - bleibt tot
    @Test
    public void tot4LebendeNachbarBleibtTot(){
        Zelle zustand = Zelle.TOT.erstellenVonNaechsteGeneration(4);
        assertEquals(Zelle.TOT, zustand);
    }

    //Tot - 2 Nachbaren - bleibt tot
    @Test
    public void tot2LebendeNachbarBleibtTot(){
        Zelle zustand = Zelle.TOT.erstellenVonNaechsteGeneration(2);
        assertEquals(Zelle.TOT, zustand);
    }
}