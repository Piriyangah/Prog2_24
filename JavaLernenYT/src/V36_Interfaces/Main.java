package V36_Interfaces;

import org.w3c.dom.html.HTMLIsIndexElement;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        /*
        Laprador molly = new Laprador(5,"molly","weiß");
        Dackel bruno = new Dackel(10, "bruno", 6);
        Schäferhund senta = new Schäferhund();
         */

        // statt so wie oben mit den Klassenname, kann man auch mit der InterfaceName Objekte erstellen
        // dabei hat man dann keine 3 Hundeklassen, sondern 3 HundeInterfaces mit unterschiedlichen Implementierungen
        HundInterface molly = new Laprador(5,"molly","weiß");
        HundInterface bruno = new Dackel(10, "bruno", 6);
        HundInterface senta = new Schäferhund();
        // dann sind auch nur noch die Methoden aus dem Hundeinterfaces die wir abrufen können
        // und nicht wie oben, alles aus der jeweiligen Hunde-Klasse
        // -> Das ist eine sehr elegante Art wie man die Funktion einer Klass
        //    nach außerhin unsichtbar machen und nur die Methoden anzeigen, die
        //    die von dem Interface vorgegeben wurden und jedes Hund-Objekt diese unterschiedlich
        //    implementiert hat

        HundInterface[] hunde ={molly, bruno, senta};
        for(HundInterface hund : hunde) {
            System.out.println();
            System.out.println(hund.getClass().toString());
            hund.belle();
            hund.fressen();
        }

    }
}
