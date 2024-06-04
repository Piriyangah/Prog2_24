package uebung8_280524;

public class Fibonacci {
/*
    wenn:
    index0 = 0
    index1 = 1
    index2 = 1 (0+1) index0+index1
    index3 = 2 (1+1) index1+index2
    index4 = 3 (1+2) index2+index3
    index5 = 5 (2+3) index3+index4 usw....
 */
    public int fibValueAtIndex(int gegebeneIndex) {
        int a = 0;
        int b = 1;
        int c = 0; // initialiseren, damit der compiler nicht meckert
        for (int index = 2; index <= gegebeneIndex ; index++) {
            c = a + b; //index6=8 = index4=3 + index5=5
            a = b;     //in index4 wird index5 Wert gespeichert
            b = c;     //index5 wird index6 gespeicher
        }
        return c;
    }
}

