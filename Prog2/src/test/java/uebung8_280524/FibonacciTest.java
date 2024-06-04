package uebung8_280524;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void index0Gleich0(){
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fibValueAtIndex(0);
        assertEquals(0,result);
    }

    @Test
    public void index1Gleich1(){
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fibValueAtIndex(1);
        assertEquals(1,result);
    }

    @Test
    public void index2Gleich1(){
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fibValueAtIndex(2);
        assertEquals(1,result);
    }

    @Test
    public void index3Gleich2(){
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fibValueAtIndex(3);
        assertEquals(2,result);
    }

    @Test
    public void index10Gleich55(){
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fibValueAtIndex(10);
        assertEquals(55,result);
    }

}