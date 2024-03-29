package WorkWithStreamsPt3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/*
Как быть, если в списке есть элемент null
*/

public class NullInList {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Этот элемент равен null";
        //напишите тут ваш код
        list.forEach(x -> System.out.println(Optional.ofNullable(x).orElse(text)));
    }
}