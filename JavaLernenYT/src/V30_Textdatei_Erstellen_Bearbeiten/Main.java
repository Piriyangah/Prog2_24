package V30_Textdatei_Erstellen_Bearbeiten;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //Erstellen von Datei inkl. RuntimeException falls probleme
        File datei = new File("test.txt");
        // - einen FileWriter writer = new FileWriter(datei); erstellen
        //   und dann auf new Filewriter drauf und alt+Eingabe und auf suurounder with try/catch klicken
        try {
            //Erstellen von Datei
            FileWriter writer = new FileWriter(datei, true);
            //Schreiben ins Datei
            writer.write("Hello file \n");
            writer.write("Line 2 \n");
            writer.write("Zeile 3 \n");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Datei konnte nicht bearbeitet werden");;
        }
    }
}
