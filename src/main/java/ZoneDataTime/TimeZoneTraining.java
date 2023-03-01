package ZoneDataTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/*
Тренировка временных зон
*/
//не решено
public class TimeZoneTraining {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        //напишите тут ваш код
        for (String s: ZoneId.getAvailableZoneIds()){

        }
        return null;
    }

    static ZonedDateTime getBeijingDateTime() {
        //напишите тут ваш код

        return null;
    }
}