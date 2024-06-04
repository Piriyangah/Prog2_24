package aufgabe4_Eventverwaltung;

public class Teilnehmer {
    // OV
    private String vorname;
    private String nachname;
    private final int geburtsjahr;

    // Konstruktor für Teilnehmer-Objekte erstellen
    public Teilnehmer(String vorname, String nachname, int geburtsjahr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsjahr = geburtsjahr;
    }

    // Getter für zugriff
    public String getVorname() {
        return this.vorname;
    }
    public String getNachname(){
        return this.nachname;
    }
    public int getGeburtsjahr(){
        return this.geburtsjahr;
    }

    //KA in Tutorium
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (o != null && o.getClass() == this.getClass()) {
            Teilnehmer that = (Teilnehmer)o;
            return that.geburtsjahr == this.geburtsjahr && that.nachname.equals(this.nachname) && that.vorname.equals(this.vorname);
        } else {
            return false;
        }
    }

    //toSting() für Ausgabeformat
    @Override
    public String toString() {
        return "\n 'Teilnehmer{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", geburtsjahr=" + geburtsjahr +
                '}';
        /* in Tutorium:
        public String toString() {
        String s = String.format("%s %s, %d", this.vorname, this.nachname, this.geburtsjahr);
        return s;}
         */
    }
}

