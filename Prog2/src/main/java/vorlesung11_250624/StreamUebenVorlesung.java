package vorlesung11_250624;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamUebenVorlesung {
    public static void main(String[] args) {
        streamErzeugen();
    }

    private static void streamErzeugen() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> stream = list.stream();
        stream.forEach(i -> System.out.println(i + " "));
        System.out.println();

        Stream<String> stringStream = Stream.of("Apfel", "Banane", "Orange");

        Person person = new Person("Mimosa", 12, "Berlin");
        Stream<Person> personStream = Stream.of(new Person("Anna", 20, "Berlin"),person);


    }
}
