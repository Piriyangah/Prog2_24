package aufgabe6_Test;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

public class DigitsTest{
    /*
     * Plan: shareDigit(a,b)
     * a=10 b=9  -> Exception
     * a=10 b=100  -> Exception
     * a=100 b=10  -> Exception
     * a=-10 b=9  -> Exception
     * a=36 b=37 -> true
     * a=21 b=52 -> true
     * a=41 b=13 -> true
     * a=25 b=45 -> true
     * a=44 b=44 -> true
     * a=12 b=34 -> false
     * a=33 b=55 -> false
     */
    //static Digits digits;

    /*@BeforeAll
    public static void setup(){
        digits = new Digits();
    }*/

    @Test
    public void shareDigits36And37(){
        Digits digits = new Digits();
        boolean result = digits.shareDigit(36,37);
        assertTrue(result);
    }

    @Test
    public void noShareDigits21And52(){
        Digits digits = new Digits();
        boolean result = digits.shareDigit(21,52);
        assertTrue(result);
    }

    @Test
    public void noShareDigits41And13(){
        Digits digits = new Digits();
        boolean result = digits.shareDigit(41,13);
        assertTrue(result);
    }

    @Test
    public void noShareDigits25And45(){
        Digits digits = new Digits();
        boolean result = digits.shareDigit(25,45);
        assertTrue(result);
    }

    @Test
    public void noShareDigits44And44(){
        Digits digits = new Digits();
        boolean result = digits.shareDigit(44,44);
        assertTrue(result);
    }

    @Test
    public void noShareDigits12And34(){
        Digits digits = new Digits();
        boolean result = digits.shareDigit(12,34);
        assertFalse(result);
    }

    @Test
    public void noShareDigits33And55(){
        Digits digits = new Digits();
        boolean result = digits.shareDigit(33,55);
        assertFalse(result);
    }

    @Test
    public void firstDigitOutOfRangeExceptions(){
        Digits digits = new Digits();
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            digits.shareDigit(100,10);
        });
        assertEquals("the numbers are not in the range 10-99",e.getMessage());
    }

    @Test
    public void secondDigitOutOfRangeExceptions(){
        Digits digits = new Digits();
        Exception e = assertThrows(IllegalArgumentException.class, () -> { //() ist eine Leeremethode die digits.shareDigit(100,10) aufruft
            digits.shareDigit(10,100);
        });
    }
/*
    @Test
    public void NegativeNumberExceptions(){
        Digits digits = new Digits();
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            digits.shareDigit(-10,9);
        });
        assertEquals("the numbers are not in the range 10-99",e.getMessage());
    }

    @Test
    public void EdgeNumberExceptions(){
        Digits digits = new Digits();
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            digits.shareDigit(10,9);
        });
        assertEquals("10 is not in Range",e.getMessage());
    }

 */

    /*
     * Plan: isIn1To10(a,boolean)
     * Outside = true
     * n=-1 -> true
     * n=0  -> true
     * n=1  -> true
     * n=5  -> false
     * n=10 -> true
     * n=11 -> true
     *
     * Outside = false
     * n=-1 -> false
     * n=0  -> false
     * n=1  -> true
     * n=5  -> true
     * n=10 -> true
     * n=11 -> false
     */

}