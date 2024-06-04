package V22_BreakAndContinue;
//Label: man bennent die schleifen und sagt dann mit der name, welche
//       genau abgebrochen werden sollen
//       - Labels sind

import java.util.Random;

public class Main_Labels {
    public static void main(String[] args) {

        loop: while(true){ //endlos Schleife
            for (int i = 0; i < 10; i++) {
                if(i == 6){
                    continue loop;
                }
                System.out.println(i);
            }

            //weiter beispiel
            Random random = new Random();
            forLoop: for (int i = 0; i < 10; i++) {
                whileLoop: while(true){
                    int i2 = random.nextInt(100);
                    if(i2 == 1){
                        System.out.println("Erfolgreich");
                        continue forLoop;
                    }
                }
            }
        }
    }
}
