package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
Чиним формат
*/

public class FixFormat {

    public static void main(String[] args) {
        Date date = new Date("6 January 2010");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formatter.format(date));
    }
}