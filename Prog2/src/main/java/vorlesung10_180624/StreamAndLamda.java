package vorlesung10_180624;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAndLamda {
    public static void main(String[] args) {
        colorExample();
        basicStreamExamples();
    }
    //2
    private static void basicStreamExamples() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        //erstellen einen Stream
        Stream<Integer> stream = numbers.stream();
        stream.forEach(n -> System.out.println(n));

        //Fehler weil Stream schon konsumiert
        //stream.forEach(n -> System.out.println(n))

        //neuer Stream 
        numbers.stream().forEach(n -> System.out.println(n));
    }

    //1
    private static void colorExample() {
        List<String> allColors = List.of("red","blue","green", "yellow", "orange", "pink");

        for (String color : allColors){
            System.out.println(color);
        }

        allColors.forEach(color -> System.out.println(color));

        List<Integer> integers = List.of(1,2,3,4,5,6,7);
        integers.forEach(integer -> {
            integer += 5;
            System.out.println(integer);
        });
    }

}
