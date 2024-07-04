package V7_WhileSchleife;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.format("%n%nVideo 7 - WHILE SCHLEIFEN %n");
        /* While(BEdingung){
        }   läuft das Programm die While-Schleife solange durch bis die BEdingung False ergibt
         */

        //Integer Bsp:
        int counter = 3;
        while(counter >= 0){
            System.out.println("Der Counter steht bei " + counter);
            counter--;
        }

        //Boolean Bsp:
        counter = 3;
        boolean weiter = true;
        while(weiter){
            System.out.println("Der Counter steht bei " + counter);
            counter--;
            if(counter<0){
                weiter = false;
            }
        }
        System.out.println("Programm beendet");

        //aktiv abbrechen
        while(true){
            System.out.println("Der Counter steht bei " + counter);
            counter--;
            if(counter<0){
                break; //sagt dass die Schleife abgebrochen wird
            }
        }
        System.out.println("Programm beendet");

        /*
        while(true) ist eine endlos schleife, da muss eine if-Bedingung oder ein "beake" definiert werden
        while(false) ist eine Bedingung, wobei es nichtmal anfängt durch die Schleife zugehen. Es gibt vorher schon ab
        -> Wenn While-Schleife, dann eine gute Abbruchbedingung definieren
         */

        //eine Gute Empfehlung "while"-Scheife mit Nutzereingaben verwenden

        Scanner scan2 = new Scanner(System.in);
        int value = 1;
        while(value == 1){
            System.out.println("🎶All I need 🎶");
            System.out.println("🎶Is Your Lovee tonight 🎶");
            System.out.println("Erneut abspielen? ja(1) nein(any other number) ");
            Scanner scan = new Scanner(System.in);
            value = scan.nextInt();
        }
        System.out.println("Programm beendet");

    }
}
