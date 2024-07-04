package vorlesung11_020724;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Key muss eindeutig sein, der Wert kann geändert werden.
 */

public class MapUebung {
    public static void main(String[] args) {
        Map<String, Double> notenMap = new HashMap<>();

        notenMap.put("A",1.0);
        notenMap.put("B",2.0);
        notenMap.put("C",3.0);
        notenMap.put("D",4.0);
        notenMap.put("E",5.0);

        System.out.println(notenMap);
        notenMap.put("C",1.0);          // hier wird 3-0 überschrieben; aber "C" kann man nicht überschreiben
        System.out.println(notenMap);

        System.out.println("Groesse: " +notenMap.size());

        Set<Map.Entry<String, Double>> entries = notenMap.entrySet();       // Holen alle Einträge aus Map und übergeben diesen in einer set
        for(Map.Entry<String, Double> entry : notenMap.entrySet()){
            System.out.println("Surdierende " + entry.getKey() + "hat eine " + entry.getValue());
        }

        System.out.println(notenMap.get("A"));
        System.out.println(notenMap.get("F"));

        //....

        System.out.println(notenMap);
        notenMap.remove("A");
        System.out.println(notenMap);






    }
}
