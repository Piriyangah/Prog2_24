package V14_KlassenUndObjekte;
/*
 * Klasse erstenn: Sichbarkeitoperator class Klassenname
 * nicht jede Klass hat seine eigene Main()
 * Objektorientierung: Klassen geschickt miteinander verbinden
 * Klassen dient ein Objekt zu erstellen, welches nur eine Teillösung des Programms beinhaltet
 * Man verbindetet mehrer Klasse, um das Problem zu lösen
 *
 * Klasse definiert eigene:
 * -> Attribute(Variable) (man braucht Konstuktor)
 * -> Methoden: sind Funktionen, bzw Tätigkeiten, die jedes Objekt dieser Klasse beinhalten muss
 *
 * Methoden Konstrukt:
 *  Sichbarkeit Rückgabetyp Name (Variablen){
 *
 *  }
 */

public class Hund {
    //Attribute
    int alter;
    String art;
    String fellfarbe;
    boolean kannPfoteGeben;

    public void bellen(){
        System.out.println("Wuff wuff");
    }

    public void plusRechnen(int zahl1, int zahl2, int zahl3){
        System.out.println(zahl1 + zahl2 + zahl3);
    }

}
