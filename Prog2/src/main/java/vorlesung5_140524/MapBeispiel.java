package vorlesung5_140524;
import java.util.HashMap;
import java.util.Map;

public class MapBeispiel {
    public static void main(String[] args) {
        //Erstellen einer neuen Hashmap
        HashMap <String, Integer > map = new HashMap <>();

        //Hinzufügen von Schlüssel-Wert-Paaren in die Map
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        //Zugriff auf Werte über Schlüssel
        System.out.println("Alice's age: " + map.get("Alice")); //Schlüssel ist "Alice"

        //
        System.out.println("Fee's age: "+ map.get("Fee"));

        //Überprüfen, ob ein Schlüssel in der Map vorhanden ist
        if(map.containsKey("Bob")){
            System.out.println("Bob's age: " + map.get("Bob"));
        }

        //Überprüfen, ob ein Wert in der Map vorhanden ist
        if(map.containsValue(30)){
            System.out.println("jemand ist 30");
        }

        //Iterieren über die Schlüssel der Map
        for (String key: map.keySet()){
            System.out.println("key:" + key);
        }

        //Iterieren über die Schlüssel der Map
        for (Integer value: map.values()){
            System.out.println("value:" + value);
        }

        //Iterieren über die Schlüssel-Werte-Paare der Map
        for (Map.Entry <String, Integer> e: map.entrySet()){ //Entry is eine Klasse
            e.getKey();
            e.getValue();
        }

        //Entfernen eines Eintrags
        map.remove("Charlie");
        System.out.println(map);
    }

}
