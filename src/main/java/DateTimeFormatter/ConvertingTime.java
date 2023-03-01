package DateTimeFormatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Простой шаблон
*/

public class ConvertingTime {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        //напишите тут ваш код
        DateTimeFormatter dnf = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
        String text = dnf.format(localDateTime);
        System.out.println(text);
    }
}