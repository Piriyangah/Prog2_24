package V2_Variablen;

public class Main {
    public static void main(String[] args) {
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

    }
}
