package FunctionalMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/*
Получение потока Stream
*/

public class StreamInterface {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Зима", "Весна", "Лето", "Осень");

        Stream<String> stringStream = getStreamFromArrayList(strings);
        stringStream.forEach(System.out::println);

        var integers = new Integer[]{12, 34, 56, 78, 90};

        Stream<Integer> integerStream = getStreamFromArray(integers);
        integerStream.forEach(System.out::println);
    }

    public static Stream<String> getStreamFromArrayList(ArrayList<String> list) {
        //напишите тут ваш код
        Stream<String> stream = list.stream();
        return stream;
    }

    public static Stream<Integer> getStreamFromArray(Integer[] array) {
        //напишите тут ваш код
        Stream<Integer> stream = Arrays.stream(array);
        return stream;
    }
}
