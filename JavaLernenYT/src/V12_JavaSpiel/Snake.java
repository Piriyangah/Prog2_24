package V12_JavaSpiel;

import javax.swing.text.Position;
import java.awt.*;
import java.util.Scanner;

public class Snake {
    public static void main(String[] args) {
        //1. Objeket und Spielfold erstellen + Point Klasse importieren
        Point spielerPosition = new Point(10,9);
        Point schlangePosition = new Point(20,2);
        Point goldPosition = new Point(6,6);
        Point tuerPosition = new Point(2,5);
        boolean weiter = true;
        boolean goldEingesammelet = false;

        //10x40
        while (weiter){
            for (int y = 0; y < 10; y++) { //Zeilen
                for (int x = 0; x < 40; x++) { //Spalten
                    Point p = new Point(x,y); // mache einen Kontroll Point und vergleiche die Stellen
                    if(p.equals(spielerPosition)){ // mit Spieler, Schlange, Gold und Tür
                        System.out.print("P");
                    } else if (p.equals((schlangePosition))) {
                        System.out.print("S");
                    } else if (p.equals(goldPosition)){
                        System.out.print("G");
                    } else if (p.equals(tuerPosition)){
                        System.out.print("T");
                    }else {
                        System.out.print("."); //ACHTUNG NUR PRINT OHNE LN
                    }
                }
                System.out.println();
            }
            // wenn die Schlange Spieler fangt und den Sppiel verliert
            if(schlangePosition.equals(spielerPosition)){
                weiter = false;
                System.out.println("Zzz... Die Schlange hat dich.");
            } if(spielerPosition.equals(goldPosition)) {
                goldEingesammelet = true;
                goldPosition = new Point(-1,-1);
            } if(spielerPosition.equals(tuerPosition) && goldEingesammelet){
                weiter = false;
                System.out.println("Gewonnen!");
            }

            bewegeSpieler(spielerPosition); // 2. die Methode aufrufen und dann auf alt+Enter und auf create methode
            bewegeSchlange(schlangePosition, spielerPosition);// 4. Schlange läuft hinterher
        }
    }

    private static void bewegeSchlange(Point schlangePosition, Point spielerPosition) {
        if(spielerPosition.x < schlangePosition.x){
            schlangePosition.x--;
        } else if (spielerPosition.x > schlangePosition.x) {
            schlangePosition.x++;
        } else if (spielerPosition.y < schlangePosition.y){
            schlangePosition.y--;
        } else if (spielerPosition.y > schlangePosition.y) {
            schlangePosition.y++;
        }
    }

    private static void bewegeSpieler(Point spielerPosition) {
        //3. der Nutzer soll eine der Buchstaben (w,a,s,d) eingeben und diese sollen dann nach oben, unten, links, rechts gehen
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        if (input.equals("o")){
            if(spielerPosition.y > 0){
                spielerPosition.y--;
            }
        } else if (input.equals("u")) {
            if(spielerPosition.y <9){
                spielerPosition.y++;
            }
        } else if (input.equals("l")) {
            if(spielerPosition.x > 0){
                spielerPosition.x--;
            }
        }else if (input.equals("r")){
            if (spielerPosition.x < 39){
                spielerPosition.x++;
            }
        }

    }
}
