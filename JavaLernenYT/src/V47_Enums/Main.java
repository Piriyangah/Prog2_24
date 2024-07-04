package V47_Enums;
/*
- Enum kann man auch in anderen Klassen benutzen (in Arrays nicht)
- Enum kann nicht einfach erweitert werden.
  Es bleibt auf die Elemente eingeschränkt, wobei bei den Arrays, werte beliebig
  erweitert oder geändert werden können
 */

// Enum erstellen
enum Jahreszeiten{ // sagen dass es eine Aufzählung ist
    FRÜHLING,SOMMER,HERBST,WINTER; // enum GR0SS schreiben
    // Feste Werte die nicht einfach verändert werden können!

}


public class Main {
    public static void main(String[] args) {
        // Enum = Enumeration = Aufzählung
        // Bsp: mit String-Array
        String[] jahreszeiten = {"Frühling", "Sommer", "Herbst", "Winter"}; //String-Array

        String dieCoolsteJahreszeit = jahreszeiten[1]; // wie erstellen eine Varibale aus der Basis der Werte??

        if (dieCoolsteJahreszeit.equals("Sommer")) {
            System.out.println("Gute Wahl 👌");
        } else if (dieCoolsteJahreszeit.equals("Herbst")){
                System.out.println("Schlechte Wahl");
        }

        // Code verbessert mit Enum, statt Array
        // Variable auf Basis von Enum erstellen
        Jahreszeiten dieCoolsteJahreszeitEnum = Jahreszeiten.SOMMER; // EnumName(Klasse) variableName = EnumName.EinEnumWert;

        switch(dieCoolsteJahreszeitEnum){       // wenn es folgende Werte einnimmt; führe die Texte aus
            case FRÜHLING :
                System.out.println("Frühling :)");
                break;
            case SOMMER:
                System.out.println("Sommer :))");
                break;
            case HERBST:
                System.out.println("Herbst :(");
                break;
            case WINTER:
                System.out.println("Winter :|");
                break;
        }

    }
}
