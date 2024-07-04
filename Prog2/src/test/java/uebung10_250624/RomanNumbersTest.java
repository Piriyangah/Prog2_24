package uebung10_250624;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

/*
erst Test schreiben:
@Test
public void testMethodeNameMitWasErwartetWird(){
     Klasse objektname = new Klassenkonstruktor();
     ReturnTypVonMethode result = objektname.getesteteMethodenName(parameter);
     assertEquals(gewollteErgebnis,result);
    }

Falls es überall eine Methode kreiert werden soll, dann diese in @BeforeAll oben schreiben
 */
public class RomanNumbersTest {

    RomanNumbers number = new RomanNumbers(); //@BeforeAll

    @Test
    public void romanNumbers1(){
    //    RomanNumbers number = new RomanNumbers();
        String result = number.convertToRomanNr(1);
        assertEquals("I",result);
    }

    @Test
    public void romanNumbers2(){
    //    RomanNumbers number = new RomanNumbers();
        String result = number.convertToRomanNr(2);
        assertEquals("II",result);
    }

    @Test
    public void romanNumbers3(){
        // ..
        String result = number.convertToRomanNr(3);
        assertEquals("III",result);
    }

    @Test
    public void romanNumbers5(){
        String result = number.convertToRomanNr(5);
        assertEquals("V",result);
    }

    @Test
    public void romanNumbers10(){
        String result = number.convertToRomanNr(10);
        assertEquals("X",result);
    }

    @Test
    public void romanNumbers20(){
        String result = number.convertToRomanNr(20);
        assertEquals("XX",result);
    }

    //schritt 4:
    @Test
    public void romanNumbers12(){
        String result = number.convertToRomanNr(12);
        assertEquals("XII",result);
    }

    //Schritt 5:
    @Test
    public void romanNumbers26(){
        String result = number.convertToRomanNr(26);
        assertEquals("XXVI",result);
    }

}