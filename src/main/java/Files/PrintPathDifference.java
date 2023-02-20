package Files;

import java.nio.file.Path;
import java.util.Scanner;

/*
Все относительно
*/

public class PrintPathDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        //напишите тут ваш код
        //определяем разницу в путях и выводим относительный путь
        try {
            Path result = Path.of(str1).relativize(Path.of(str2));
            if (result != null) {
                System.out.println(result);
            }
        } catch (Exception e){

        }
    }
}