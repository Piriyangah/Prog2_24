package aufgabe4_Eventverwaltung;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Teilnehmer t1 = new Teilnehmer("Mark", "Paul", 1980);
        Teilnehmer t2 = new Teilnehmer("Luisa", "Paul", 1980);
        Teilnehmer t3 = new Teilnehmer("Anna", "Wolf", 1980);
        Teilnehmer t4 = new Teilnehmer("Leo", "White", 1980);
        Teilnehmer t5 = new Teilnehmer("Max", "Thomsen", 1989);
        Teilnehmer t6 = new Teilnehmer("Anne", "Fischermann", 1976);
        Teilnehmer t7 = new Teilnehmer("Laura", "Tom", 1980);
        Teilnehmer t8 = new Teilnehmer("Thomas", "Paulan", 1969);
        Teilnehmer t9 = new Teilnehmer("Laura", "Tom", 1980);
        Teilnehmer t10 = new Teilnehmer("Martin", "Ludwig", 1960);

        Event e1 = new Event("Geburtstag", LocalDate.of(2024,5,13));
        e1.addTeilnehmer(t1);
        e1.addTeilnehmer(t2);
        e1.addTeilnehmer(t3);
        e1.addTeilnehmer(t10);
        e1.addTeilnehmer(t10);

        Event e2 = new Event("Hochzeit", LocalDate.of(2024,7,18));
        e2.addTeilnehmer(t4);
        e2.addTeilnehmer(t5);
        e2.addTeilnehmer(t6);

        Event e3 = new Event("name", LocalDate.of(2025,8,12));
        e3.addTeilnehmer(t7);
        e3.addTeilnehmer(t8);
        e3.addTeilnehmer(t9);
        e3.addTeilnehmer(t9);
        e3.addTeilnehmer(t9);
        e3.addTeilnehmer(t9);

        EventManager manager = new EventManager();
        manager.addEvent(e1);
        System.out.println();
        manager.addEvent(e2);
        System.out.println();
        manager.addEvent(e3);

        manager.printAllEvents();

        /* Tutorium
        public Main() {
    }

    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        Teilnehmer teilnehmer1 = new Teilnehmer("Anna", "Becker", 1997);
        Teilnehmer teilnehmer2 = new Teilnehmer("Maria", "Voucheva", 1997);
        HashSet<Teilnehmer> gruppe1 = new HashSet();
        gruppe1.add(teilnehmer1);
        gruppe1.add(teilnehmer2);
        Event event1 = new Event("Weihnachtsfeier", LocalDate.of(2024, 12, 20));
        event1.teilnehmerHinzufuegen(teilnehmer1);
        event1.mehrereTeilnehmerHinzufuegen(gruppe1);
        System.out.println(eventManager);
    }

    public List<Integer> entschachteln(List<List<Integer>> input) {
        return null;
    }

         */
    }
}
