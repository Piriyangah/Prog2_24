package V28_String;

import java.util.Scanner;

/*
 * Exercise:
 * Ein Nutzer kann einen Satz eingeben; es wird dann ausgegeben,
 *         wie viele Großbuchstaben, Kleinbuchstaben und Leerzeichen
 *
 */
public class TexteEingebenString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib einen Satz ein: ");
        String satz = scanner.nextLine();
        checkSentence(satz);
    }

    public static void checkSentence(String satz){
        char[] chars = satz.toCharArray(); //Text wird to array mit Zeichen
        int anzahlGroßB = 0;
        int anzahlKleinB = 0;
        int anzahlLeerZ = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' '){
                anzahlLeerZ++;
            }
            if (Character.isUpperCase(chars[i])){
                anzahlGroßB++;
            }
            if (Character.isLowerCase(chars[i])){
                anzahlKleinB++;
            }
        }
        System.out.println("Dieser Satz enthält folgende: ");
        System.out.println("Anzahl Großbuchstaben: " + anzahlGroßB);
        System.out.println("Anzahl Kleinbuchstaben: " + anzahlKleinB);
        System.out.println("Anzahl Leerzeichen: " + anzahlLeerZ);

    }


}
