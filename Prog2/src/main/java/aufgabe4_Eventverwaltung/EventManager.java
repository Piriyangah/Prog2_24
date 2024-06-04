package aufgabe4_Eventverwaltung;

import java.util.ArrayList;
import java.util.List;

public class EventManager {

    // deklarieren von neuen List für Events
    private List<Event> eventList = new ArrayList<>();

    // Event hinzufügen
    public void addEvent(Event e){
        eventList.add(e);
    }

    // Events aus der Liste auslesen
    public void printAllEvents(){
        System.out.println(eventList);
    }
    /* ODER
    public void printAllEvents() {
        for (Event event : eventList) {
            System.out.println(event);
        }
    }
     */
/*
    Vorschlag:
    public void addTeilnehmerZuEvent(Event e, Teilnehmer t){
        e.addTeilnehmer(t);
    }
    ------ in Main : manager.addTeilnehmerToEvent(event1, teilnehmer1);
                     manager.addEvent(event1);
                     manager.printAllEvents();
                     manager.printAllTeilnehmerOfEvent(event2);
 */

    //Events Löschen
    public void removeEvent(String eventName) {
        Event eventLöschen = null;
        for (Event vergleichsEvent : eventList){
            if(vergleichsEvent.getEventName().equals(eventName)){
                eventLöschen = vergleichsEvent;
            }
        }
        eventList.remove(eventLöschen);
    }
}
