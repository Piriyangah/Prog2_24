package V9_RandomKlasse;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
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
            word1+=letters.charAt(stelle); //charAt gibt eine Buchstabe in der Stelle X an
        }
        System.out.println(word1);

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


    }
}
