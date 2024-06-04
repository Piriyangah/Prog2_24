package aufgabe_wuerfelspiel;
 import java.util.Random;
 import java.util.Scanner;

public class Spielablauf {

    Spieler spieler[];

    public void spielerAnzahl(){
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte gib die Anzahl von Spielern ein: ");
        int anzahlSpieler = input.nextInt();
        input.nextLine(); // Verbrauche den Zeilenumbruch

        spieler = new Spieler[anzahlSpieler];
        for (int index = 0; index < spieler.length; index++) {
            spieler[index] = new Spieler();
        }
    }

    public int wuerfeln(){
        Random r = new Random();
        int zufallsZahl = r.nextInt(6)+1;
        return zufallsZahl;
    }

    public int versuch(){
     //   int merken = wuerfeln();
     //   int[] versucheMerken = new int[0];
        int summe = 0;
        boolean weiterWuerfeln = true;
        Scanner scanner = new Scanner(System.in);
    //    boolean answer = scanner.nextBoolean();
   //     boolean answerYes = true;
        //     boolean answerNo = false;
/*
        while (merken < 6){
            System.out.println("Es wurde " + merken + "gewürfelt. " +
                    "Wenn Sie weiter würfeln wollen, dann Schreiben Sie 'true' " +
                    "Wenn Sie abbrechen wollen, dann schreiben Sie 'false'");
            summe += merken;
            if(answer == answerYes) {
                merken = wuerfeln();
            }
            if (answer == answerNo) {
                System.out.println("Du hast mit deinem Spiel abgebrochen!");
            }
        }
        return summe;

 */
        while (weiterWuerfeln){
            int wurf = wuerfeln(); // Würfeln
            System.out.println("Du hast eine " + wurf + " gewürfelt.");

            if (wurf == 6) {
                System.out.println("Du hast eine 6 gewürfelt. Dein Versuch endet hier.");
                break; // Versuch beenden, wenn eine 6 gewürfelt wurde
            }
            summe += wurf; // Wurf zur Summe hinzufügen

            System.out.println("Möchtest du weiter würfeln? (ja/nein)");
            String antwort = scanner.nextLine(); // Eingabe des Spielers lesen
            if (antwort.equalsIgnoreCase("nein")) {
                weiterWuerfeln = false;
            }
        }
        return summe;
/*
        for(int index = 0; index < ; index++)
        {
            if(zufallsZahl == 6) {
                System.out.println("Du hast eine "+zufallsZahl+ " gewürfelt.");
            }
        }
 */

    }
    public void start(){
        spielerAnzahl(); // Spieleranzahl abfragen
        int punkte = versuch(); // Versuch des Spielers
        System.out.println("Du hast insgesamt " + punkte + " Punkte erreicht.");
    }

}
