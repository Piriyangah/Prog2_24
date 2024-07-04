package uebung4_;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZelleTest {

    //unvollständig

    @Test
    void simuliereNaechsteGeneration() {
        Zelle zelle = Zelle.LEBENDIG;
        Zelle result = zelle.simuliereNaechsteGeneration(3);
        assertEquals(Zelle.LEBENDIG, result);
    }

    @Test
    void negativeZahl() {
        Zelle zelle = Zelle.LEBENDIG;
        assertThrows(IllegalArgumentException.class,() -> zelle.simuliereNaechsteGeneration(-1));
        //Es ist ein Lamnda aufruf -> eine anonyme Methoden aufruf
        // () -> ein Platzhalter für Parameter
    }


}