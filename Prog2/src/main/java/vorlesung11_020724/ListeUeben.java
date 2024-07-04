package vorlesung11_020724;

import java.util.*;

public class ListeUeben {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list = new ArrayList<>(); //  new LinkedList<>();

        // Elemente hinzufügen
        list.add("Apfel");
        list.add("Banane");
        list.add("Kirsche");

        List<String> andereOption = Arrays.asList("Apfel","Birne","Kirsche");
        System.out.println(list);

        //Elemente an bestimmter Stelle einfügen
        list.add(1, "Birne");
        System.out.println(list);

        System.out.println("Groesse: " + list.size());

        for (String obst : list) {
            System.out.println(obst + "*");
        }

        list.stream().forEach(obst -> System.out.println(obst + "*"));

        list.remove("Banane");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        if(list.contains("Apfel")){
            list.remove("Apfel");
        }
        else{
            list.add("Apfel");
        }

        HashSet<String> set = new HashSet<>();
        set.add("Apfel");
        set.add("Birne");
        set.add("Kirsch");
        System.out.println("Set Groesser " + set.size());






    }
}
