package V18_Ueberladungen;

public class Main {
    /*
     * Überladungen: - 2 gleichnamige Methoden mit unterschiedlichen Parameter
     *               - bzw. mehrere Methoden, gleicher Name, unterschiedliche Parameter
     *               - Konstruktoren sind sozusagen auch Methoden, also hier auch Überladen möglich
     *               - ist ein Codestyle
     */
    public static void main(String[] args) {
        int zahl1 = 234;
        int zahl2 = 642;
        int zahl3 = 973;

        // mit Strg + P -> zeigt die Methoden unterschiedlichen Parameter angezeiegt
        addieren(zahl1,zahl2);
        addieren(zahl1,zahl2,zahl3);

    //------Konstruktor() Überladungen ... mit Klasse User
    User u1 = new User("Arthur",19,"+49...",43.5);
    User u2 = new User("Arthur", 19);
    }

    public static void addieren(int zahl1, int zahl2){
        System.out.println(zahl1+zahl2);
    }

    //Überladen: gleichnamige Methode, mit 1 Paramter mehr
    public static void addieren(int zahl1, int zahl2, int zahl3){
        System.out.println(zahl1+zahl2+zahl3);
    }
}
