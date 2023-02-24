package DateTimeAPI;

import java.time.LocalDate;

/*
Освоение нового API
*/

public class Get20September {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //напишите тут ваш код
        LocalDate today = LocalDate.now();
        return today;
    }

    static LocalDate ofExample() {
        //напишите тут ваш код
        LocalDate simpleDate = LocalDate.of(2020, 9,12);
        return simpleDate;
    }

    static LocalDate ofYearDayExample() {
        //напишите тут ваш код
        int numberOfSimpleDate = ofExample().getDayOfYear();
        LocalDate simpleDate = LocalDate.ofYearDay(2020, numberOfSimpleDate);
        return simpleDate;
    }

    static LocalDate ofEpochDayExample() {
        //напишите тут ваш код
        int a = (int) ofExample().toEpochDay();
        LocalDate simpleDate = LocalDate.ofEpochDay(a);
        return simpleDate;
    }
}
