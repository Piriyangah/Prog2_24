package aufgabe6_Test;

public class Lotterie {

    // TODO schreibe Test
    // denke über Edgecases nach
    // erreiche 100% Coverage
    public int greenTicket(int a, int b, int c) {
        if (a == b && a == c) {     // wenn alle gleiche
            return 20;
        }
        if (a == b || a == c || b == c) { // wenn 2 gleich
            return 10;
        }
        return 0;
    }

    // TODO schreibe Test
    // denke über Edgecases nach
    // erreiche 100% Coverage
    public int redTicket(Value a, Value b, Value c) {
        if (a.equals(Value.TWO) && b.equals(Value.TWO) && c.equals(Value.TWO)) { //wenn alle dern Wert 2 haben
            return 10;
        }
        if (a.equals(b) && a.equals(c)) {        // wenn a = b und a = c
            return 5;
        }
        if (!a.equals(b) && !a.equals(c)) {     // wenn a != b und a != c
            return 1;
        }

        return 0;
    }

    public enum Value {
        ZERO, ONE, TWO
    }
}
