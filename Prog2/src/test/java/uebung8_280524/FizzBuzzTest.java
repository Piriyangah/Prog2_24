package uebung8_280524;

import junit.framework.TestCase;
import org.junit.Test;

public class FizzBuzzTest extends TestCase {
    @Test
    public void teilbarDurch3Fizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzbussPruefung(3);
        assertEquals("Fizz",result);
    }

    @Test
    public void teilbarDurch5Buzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzbussPruefung(5);
        assertEquals("Buzz",result);
    }

    @Test
    public void teilbarDurch3Und5FizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzbussPruefung(15);
        assertEquals("FizzBuzz",result);
    }

    @Test
    public void nichtteilbarDurch3Und5n(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzbussPruefung(4);
        assertEquals("4",result);
    }

}