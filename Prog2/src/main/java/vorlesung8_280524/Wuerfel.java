package vorlesung8_280524;

import org.mockito.Mockito;

import java.util.Random;
public class Wuerfel {

    private final Random random = Mockito.mock(Random.class);
   // Mockito.when(random)
    public Wuerfel(Random random){

    }

    public int wuerfel(){
        return random.nextInt(6)+1;
    }

    public static void main(String[] args) {

    }
}
