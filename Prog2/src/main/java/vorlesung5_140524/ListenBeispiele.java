package vorlesung5_140524;
import java.util.*;
//LISTE, SET, MAP

public class ListenBeispiele {
    public static void main(String[] args) {
        //1. Liste
        LinkedList<String> linkedliste = new LinkedList();
        linkedliste.add("A");
        linkedliste.add("B");
        linkedliste.add("C");
        System.out.println(linkedliste);

        //2. Liste
        LinkedList<Integer> integersListe = new LinkedList<>();
        integersListe.add(1);
        integersListe.add(2);
        linkedliste.addAll(linkedliste);
        System.out.println(integersListe);

        //3. arrayliste
        new ArrayList<>();
        // Liste oder Set

        // Set - nur einzigartige Werte
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(1);
        System.out.println(integerSet);

        // Liste - alles auch doppelte Werte
        List<Integer> integerListe = new ArrayList<>();
        integerListe.add(1);
        integerListe.add(2);
        integerListe.add(3);
        integerListe.add(1);
        System.out.println(integerListe);

        // Map
        HashMap <String, Integer > map = new HashMap <>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        System.out.println(map);

    }




}
