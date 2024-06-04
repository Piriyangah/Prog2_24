package V22_BreakAndContinue;
// nicht viel anders zu continue
//break bricht den Vorgang ab

import java.util.Random;

public class Main_break {
    public static void main(String[] args) {
        //break

        for (int i = 0; i < 12; i++) {
            if(i==5){
                break; //durchlauf der Schleife soll dann gestoppt werden
            }
            System.out.println(i);
        }
        // weitere bsp für breake: es soll zufällig 3 mal 6 ausgegeben werden, dann break
        Random random = new Random();
        int counter = 0;
        while(true){
            int i = random.nextInt(10);

            if (i == 6){
                counter++;
                System.out.println(counter + ". mal eine " + i);
                if (counter == 3){
                    break;
                }
            }
            System.out.println("Schade, leider keine 6: " + i);
        }
    }
}
