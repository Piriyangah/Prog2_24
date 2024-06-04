package aufgabe4_Eventverwaltung;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Event {
    // OV
    private String eventName;
    private Set<Teilnehmer> teilnehmerSet;
    private LocalDate date;

    // Konstruktor für Event-Objekte erstellen
    public Event (String eventName, LocalDate date){
        this.eventName = eventName;
        this.date = date;
        this.teilnehmerSet = new HashSet<>();
    }

    // Getter von Name für Namen vergleichen in EventManager
    public String getEventName() {
        return eventName;
    }

    // Teilnehmer wird in Liste hinzugefügt
    /*
    public void addTeilnehmer(String vorname, String nachname, int geburtsjahr){
        Teilnehmer neueTeilnehmer = new Teilnehmer(vorname, nachname, geburtsjahr);
        this.teilnehmerSet.add(neueTeilnehmer);
    }
    */
    //Teilnehmer hinzufügen
    public void addTeilnehmer(Teilnehmer neueTeilnehmer){
        this.teilnehmerSet.add(neueTeilnehmer);
    }

    // gibt die Teilnehmer aus der Liste aus
    public Set<Teilnehmer> printAllTeilnehmer(){
        return teilnehmerSet;
    }

    // Entfernen von Teilnehmer
    public void removeTeilnehmer(String vorname, String nachname) {
        Teilnehmer teilnehmerLöschen = null;
        for (Teilnehmer vergleichsTeilnehmer : teilnehmerSet){
            if(vergleichsTeilnehmer.getVorname().equals(vorname) && vergleichsTeilnehmer.getNachname().equals(nachname)){
                teilnehmerLöschen = vergleichsTeilnehmer;
            }
        }
        teilnehmerSet.remove(teilnehmerLöschen);
        System.out.println(teilnehmerLöschen + " wurde entfernt");
    }

    /*
    public void teilnehmerHinzufuegen(Teilnehmer teilnehmer) {
        this.teilnehmerSet.add(teilnehmer);
    }

    public void mehrereTeilnehmerHinzufuegen(HashSet teilnehmerGruppe) {
        this.teilnehmerSet.addAll(teilnehmerGruppe);
    }

    public void teilnehmerEntfernen(Teilnehmer teilnehmer) {
        this.teilnehmerSet.remove(teilnehmer);
    }

    public void mehrereTeilnehmerEntfernen(HashSet teilnehmerGruppe) {
        this.teilnehmerSet.removeAll(teilnehmerGruppe);
    }
     */

    //toSting() für Ausgabeformat
    @Override
    public String toString() {
        return "\n Event{" +
                "EventName='" + eventName + '\'' +
                ", Date=" + date +
                ", Teilnehmer=" + teilnehmerSet +
                '}'+'\n';
    }
}

