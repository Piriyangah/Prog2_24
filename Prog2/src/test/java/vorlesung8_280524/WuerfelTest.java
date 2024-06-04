package vorlesung8_280524;
import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Random;

/* MOCKITO.....
Mockito: unter File->Project Structer -> Libaries -> + -> From Marven -> Eingeben: "mockito.core" ->
die neueste (hier 12.0) auswählen -> "Transitive Dependacies" anschalten ->  OK
*/

public class WuerfelTest extends TestCase {

    @Test
    public void testWuerfel(){
        Random random = Mockito.mock(Random.class);
        Wuerfel wuerfel = new Wuerfel(new Random());
        int result = wuerfel.wuerfel();
        assertEquals(5,result);
    }

}