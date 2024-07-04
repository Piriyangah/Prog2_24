package V6_ScannerKlasse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.format("%n%nVideo 6 - SCANNER IN JAVA %n");
        //man mann ganz oben über public Klasse den Scanner-Klasse importieren mit: import java.util.Scanner;
        Scanner scan = new Scanner(System.in); // erstellen von einer Objekt scan von Datentyp Scanner

        //Texte anfordern:
        System.out.println("Bitte gib einen Satz ein: ");
        String sentence;
        sentence = scan.nextLine();
        System.out.println("Dein Satz war: " + sentence);

        //Zahl anfordern:
        System.out.println("Bitte gib eine Zahl ein: ");
        int number6;
        number6 = scan.nextInt();
        System.out.println("Du hast folgende Zahl eingegeben: " + (number6+1));

    }
}
