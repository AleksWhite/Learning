package Collectors;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Из потока данных — в map
*/

public class FromStreamToMap {

    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getMap(stringStream).forEach((s, i) -> System.out.println(s + " - " + i));
    }

    public static Map<String, Integer> getMap(Stream<String> stringStream) {
        //напишите тут ваш код
        Map<String, Integer> result = stringStream
                .collect(Collectors.toMap(e -> e, e -> e.length()));
        return result;
        //короткий вариант
        //return stringStream.collect(toMap(word -> word, String::length));
    }
}