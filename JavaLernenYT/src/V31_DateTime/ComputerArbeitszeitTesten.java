package V31_DateTime;
/*
 * Testen wie schnell der Prozessor arbeitet
 * Wie lange der Computer für das ausführen eins Programms braucht
 */

import java.time.Duration;
import java.time.LocalDateTime;

public class ComputerArbeitszeitTesten {
    public static void main(String[] args) {
        long beginn = System.nanoTime();
        for (int i = 0; i < 500000; i++) {
            double x = Math.sin(i);
        }
        long ende = System.nanoTime();
        System.out.println(ende-beginn);

        LocalDateTime ldtbevor = LocalDateTime.now();
        for (int i = 0; i < 500000; i++) {
            double x = Math.sin(i);
        }
        LocalDateTime ldtafter = LocalDateTime.now();
        System.out.println(Duration.between(ldtbevor,ldtafter).toNanos());
    }
}
