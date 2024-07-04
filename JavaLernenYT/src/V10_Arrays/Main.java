package V10_Arrays;

public class Main {
    public static void main(String[] args) {
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
    }
}
