package vorlesung7_210524;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SchaltjahrTest {
    // 2001 ein typisches Normaljahr
    @Test
    public void einTypischesNormalJahr2001(){
        boolean result = Schaltjahr.istNormaljahr(2001);

        assertTrue(result);
    }

    // 1996 ein typisches Schaltjahr
    @Test
    public void einTypischesSchaltjahr1996(){
        boolean result = Schaltjahr.istNormaljahr(1996);

        assertFalse(result);
    }
    // 1990 ein typisches Normaljahr
    @Test
    public void einTypischesNormalJahr1990(){
        boolean result = Schaltjahr.istNormaljahr(1990);

        assertTrue(result);
    }

    // 2000 ein typisches Normaljahr
    @Test
    public void einTypischesSchaltjahr2000(){
        boolean result = Schaltjahr.istNormaljahr(2000);

        assertFalse(result);
    }
}
