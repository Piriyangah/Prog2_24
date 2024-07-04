package V8_ForSchleife;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.format("%n%nVideo 8 - FOR SCHLEIFE %n");
        // For: Code x mal ausführen; es endet automatisch mit der angabe
        //Bsp: wenn man
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Wie viele Zahlen möchtest du?");
        int value2 = scan3.nextInt();
        for (int index = 0; index < value2; index++) {
            System.out.println(index);
        }
        //Bsp: alle geraden Zahlen von 50 bis 100
        for (int i = 50; i < 70; i++) {
            System.out.println(i);
        }

        System.out.format("Übung: Der Nutzer soll 2 Zahlen angeben können und es sollen alle geraden Zahlen ausgeben, die dazwischen legen \n");
        Scanner scan4 = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein: ");
        int ersteZahl = scan4.nextInt();
        System.out.println("Gib eine zweite Zahl ein: ");
        int zweiteZahl = scan4.nextInt();
        if(ersteZahl<zweiteZahl){
            if (ersteZahl % 2 == 0){ // wenn rest null bzw. zahl Gerade
                for (int i = ersteZahl; i <= zweiteZahl; i+=2) {
                    System.out.println(i);
                }
            }
            else{
                for (int i = ersteZahl+1; i <= zweiteZahl; i+=2) {
                    System.out.println(i);
                }
            }
        }
        else{
            if (zweiteZahl % 2 == 0){ // wenn rest null bzw. zahl Gerade
                for (int i = zweiteZahl; i <= ersteZahl; i+=2) {
                    System.out.println(i);
                }
            }
            else{
                for (int i = zweiteZahl+1; i <= ersteZahl; i+=2) {
                    System.out.println(i);
                }
            }
        }

        //in PartyKlasse gehts weiter...

    }
}
