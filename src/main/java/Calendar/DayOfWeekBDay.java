package Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
День недели рождения твоего
*/

public class DayOfWeekBDay {

    static Calendar birthDate = new GregorianCalendar(1988, Calendar.OCTOBER, 16);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишите тут ваш код
        String result = "";
        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1 : return result = "воскресенье";
            case 2 : return result = "понедельник";
            case 3 : return result = "вторник";
            case 4 : return result = "среда";
            case 5 : return result = "четверг";
            case 6 : return result = "пятница";
            case 7 : return result = "суббота";
        }
        return result;
    }
}