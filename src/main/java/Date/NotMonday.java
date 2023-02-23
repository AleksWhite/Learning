package Date;


import java.util.Date;

/*
Лишь бы не в понедельник :)
*/

public class NotMonday {

    static Date birthDate = new Date(86, 10, 16);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код
        //получаем день недели даты на русском языке
        int numberDayOfWeek = date.getDay();
        String dayOfWeek = "";
        switch (numberDayOfWeek) {
            case 0 : dayOfWeek = "воскресенье";
                break;
            case 1 : dayOfWeek = "понедельник";
                break;
            case 2 : dayOfWeek = "вторник";
                break;
            case 3 : dayOfWeek = "среда";
                break;
            case 4 : dayOfWeek = "четверг";
                break;
            case 5 : dayOfWeek = "пятница";
                break;
            case 6 : dayOfWeek = "суббота";
                break;
            default:
                break;
        }
        return dayOfWeek;
    }
}