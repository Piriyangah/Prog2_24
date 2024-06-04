package P_V29_Textdateien;

/*
 * File Klasse:
 * - Java kann mit File selbst nicht viel machen,
 *   aber man kann unseren File unter File Klassespeichern
 * - dabei den Pfad von Speicherort über rechts Klick unter Eigenschaften rauskopieren
 * - diese in new File() mit "" einsetzten und \ durch / ersetzen und den Namen der Datei und .txt einstippen
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //File erstellen
        File datei = new File("D:/Desktop/HTW_FIW/Semester_6_SoSe_24/Prog2/JavaLernenYT_V29_bsp_text.txt");
        System.out.println(datei.isFile()); //.isFile prüft, ob man ein File erzeugen konnte // hier true

        //---- Pfad spaaren
        //File erstellen
        File datei2 = new File("history1.txt"); //Es muss dann auch Projekt Ordner liegen
        System.out.println(datei2.isFile()); //.isFile prüft, ob man ein File erzeugen konnte // hier true

        //Datei einlesen
        Scanner scan = null;
        try{
            scan= new Scanner(datei); //System.in = Benutzer eingaben | Datei = diesen Datei einlesen
        }
        catch(FileNotFoundException e){ //wenn es kein datei lesen kann
            System.out.println("File Not Found");
            //es kann sein das datei nicht existiert und somit Scanner nicht lesen kann;
            // dann soll Programm nicht abstürzen, also Try Catch
        }

        //Nur die erste ZEiel
        System.out.println(scan.nextLine()); // gibt nur die erste Zeile aus

        // alles ausgeben
        while (scan.hasNext()){//solange unser scanner noch einen Zeile als nachfolger hat
            System.out.println(scan.nextLine());

        }

        //2 Bespiel
        File hundedatei = new File("dog.txt");
        Scanner scanner = null;
        System.out.println(hundedatei.isFile()); //.isFile prüft, ob man ein File erzeugen konnte // hier true

        try{
            scanner= new Scanner(datei);
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }

        while(scanner.hasNext()){
            String name = scanner.next();
            int alter = scanner.nextInt();
            System.out.println(alter);
            String art = scanner.next();
            String farbe = scanner.next();

            Hund hund = new Hund(name, alter, art, farbe);

            System.out.println("Hund: " + name + ", Alter: " + alter + ", Art: " + art + ", Farbe: " + farbe);
            System.out.println(hund);
        }









    }
}
