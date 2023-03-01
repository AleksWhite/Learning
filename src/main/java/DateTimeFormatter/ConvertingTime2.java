package DateTimeFormatter;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
Еще один простой шаблон
*/

public class ConvertingTime2 {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        //напишите тут ваш код
        DateTimeFormatter dnf = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        String text = dnf.format(zonedDateTime);
        System.out.println(text);
    }
}