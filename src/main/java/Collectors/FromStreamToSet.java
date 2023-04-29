package Collectors;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Из потока данных во множество
*/

public class FromStreamToSet {

    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getFilteredStrings(stringStream).forEach(System.out::println);
    }

    public static Set<String> getFilteredStrings(Stream<String> stringStream) {
        //напишите тут ваш код
        HashSet<String> result = (HashSet<String>) stringStream
                .filter(x -> x.length() > 6)
                .collect(Collectors.toSet());
        return result;
    }
}