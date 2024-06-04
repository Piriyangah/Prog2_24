import java.net.StandardSocketOptions;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.format("%n Video 1 - HELLO WORLD! %n");
        System.out.println("Hello world!");

        System.out.format("%n%n Video 2 - VARIABLEN (int, double, String, boolean)%n");
        //Variable: Ein Speicher für einen Wert
        // Datentyp: Gibt an, von welcher Art die Variable ist

        int number = 3;
        System.out.println(number);

        int number2 = 14;
        int sum = number + number2;
        System.out.println(sum);

        //Variante1
        int apples = 12;
        String text = "Das ist ein ";
        System.out.println("Ich habe so viele Äpfel: " + apples);
        System.out.println(text + apples);

        //Variante1
        int anzahl = 12;
        String obst = " Birnen";
        System.out.println("Ich möchte " + anzahl + obst);

        anzahl = 1234;
        obst = " Wassermelonen";
        System.out.println("Ich möchte " + anzahl + obst);

        double fliesskommazahl = 3.1215;
        boolean bool = true;

        System.out.format("%n Video 3 - VARIABLE  ANWENDUNG PART2 %n");

        //Erstellung(Deklaration)
        int number3;
        String word;

        //Zuweisung (Initialisierung)
        number = 10;
        word = "Hello World";

        //.... weiter gehts in der Klasse Party

        System.out.format("%n Video 4 - IF-ELSE %n");
        /*
        if(Bedingung){ //Bedingung kann Wahr oder Falsch sein}
        else{}
        */

        // Integer Bsp:
        int number4 = 5;
        if(number4 == 5){
            System.out.println("Number ist gleich 5");
        } else {
            System.out.println("Number ungleich 5");
        }

        //ist gleich wie
        if(number4 != 5){
            System.out.println("Number ungleich 5");
        } else {
            System.out.println("Number ist gleich 5");
        }

        //Boolean Bsp:
        boolean bool1 = true;
        if(bool1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        //Boolean + Int Bsp:
        int number5 = 6;
        boolean erheohen = (number5 <= 5); //boolean erheohen = true;
        if(erheohen){
            number5 += 3;
            System.out.println("hier wurde 3 dazu addiert: " + number5);
        }
        else{
            System.out.println("hier wurde nichts dazu addiert: " + number5);
        }

        //AUFGABE: Der Nutzer gibt seinen Alter an. Wenn über 18 -> Volljährig ausgeben und wenn nicht dann Minderjährig
        int alter;
        alter = 18;
        if(alter >= 18){
            System.out.println("Volljährig");
        }
        else{
            System.out.println("Minderjährig");
        }

        System.out.format("%n%nVideo 5 - LOGISCHE OPERATOREN %n");
        double temperatur = 25.5;
        if(temperatur > 20){
           System.out.println("Angenehm");
        }
        else {System.out.println("Unangenehm");}
        //negieren der Ausage -> vertausch die Ausagem von if und else
        if(!(temperatur > 20)){
            System.out.println("Unangenehm");
        }
        else {System.out.println("Angenehm");}

        // UND-OPERATOR (&&): mehrere Teil-Bedingungen prüfen
        if(temperatur > 20 && temperatur <35){
            System.out.println("Angenehm");
        }
        else {System.out.println("Unangenehm");}

        // ODER-OPERATOR (||): wechselt if-else von UND
        if(temperatur > 20 || temperatur <35){
            System.out.println("Unangenehm");
        }
        else {System.out.println("Angenehm");}

        //EXCLUSIVE-ODER-OPERATOR: nur eins kann stimmen. Bsp. Jan oder Tim kann gewinnen, es geht nicht das beide verlieren oder gewinnen
        boolean jan_gewonnen = true;
        boolean tim_gewonnen = false;
        if (jan_gewonnen ^ tim_gewonnen){
            System.out.println("Richtiges Ergebenis");
        }
        else{
            System.out.println("Da stimmt was nicht...");
        }

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
            value = scan.nextInt();
        }
        System.out.println("Programm beendet");

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

        System.out.format("%n%nVideo 9 - Random-Klasse %n");
        //hier muss auch import java.util.Random; importiert werdeb
        //Random-Interger Bsp
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int zufallszahl = random.nextInt(6)+1; //random.nextInt(6) Wertebereich 0-5, deswegen +1 damit 1-6
            System.out.println(zufallszahl);
        }

        //Random-String Bsp
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String word1 = "";
        for (int i = 0; i < 5; i++) {
            int stelle = random.nextInt(26);
            word+=letters.charAt(stelle); //charAt gibt eine Buchstabe in der Stelle X an
        }
        System.out.println(word);

        System.out.format("Übung: update den oberen code, wo 2 und 4 Buchstebe soll ein Vokal sein, rest soll Konsonanten sein");
        String vokale = "AEIOU"; //5
        String konsonante = "BCDFGHJKLMNPQRSTVWXYZ"; //21
        String word2 = "";

        for (int i = 0; i < 5; i++) {
            if(i==1 || i==3){
                int stelle = random.nextInt(5);
                word2+= vokale.charAt(stelle);
            }
            else{
                int stelle = random.nextInt(21);
                word2 += konsonante.charAt(stelle);
            }
        }
        System.out.println(word2);

        System.out.format("%n%nVideo 10 - Arrays in Java %n");
        //Arrays: lässt mehrere Objekte des gleichen Datentyps speichern
        String werkzeug = "Hammer";
        String werkzeug2 = "Meißel";
        String werkzeug3 = "Schleifmaschine";

        //ist einfacher zu definieren in Array in der Schreibweise:
        String[] werkzeugskasten = {"Hammer", "Meißel", "Schleifmaschine"};
        System.out.println(werkzeugskasten[0]);
        System.out.println(werkzeugskasten.length); // gibt die Länge von Array aus

        int[] numbers = new int[10];
        //speichern Werte in Array, dabei ist von index 0 bis das Array komplett durchlaufen ist
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1; //Bsp werte von 1 bis 10 speichern (0+1, 0)
            /*
            numbers[0] = 0+1 = 1;
            numbers[1] = 1+1 = 2;
            numbers[2] = 2+1 = 3;
            numbers[3] = 3+1 = 4;
            numbers[4] = 4+1 = 5;
            numbers[5] = 5+1 = 6;
            ...
             */
        }

        //ausgaben von Werten von Array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //...weiter in Klasse Experiment

        System.out.format("%n%nVideo 11 - Methoden in Java %n");
        // Methode: ein Bestandteil von einer Klasse in der man Code schreiben kann
        // Ausgeführt wird nur der Code der in Main steht
        // Code von anderen Methode, dann muss die Methode in Main aufgerufen werden

        // shift+F6 kann man Methodenname für alle Anwendungen verändern






        System.out.format("%n%nVideo 12 -  %n");

        System.out.format("%n%n 2 Video kamen dazwischen: Einfaches Javaspiel & Objektorientierte Programmieren %n");
        System.out.format("%n%nVideo 12 - Grundlagen %n");
        System.out.format("%n%nVideo 13 - Konstruktor %n");
        System.out.format("%n%nVideo 14 - Rückgabewert %n");
        System.out.format("%n%nVideo 15 - Überladen von Java %n");
    }
}