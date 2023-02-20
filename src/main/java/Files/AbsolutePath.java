package Files;

import java.nio.file.Path;
import java.util.Scanner;

/*
Абсолютный путь
*/

public class AbsolutePath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //напишите тут ваш код
        try {
            boolean abs = Path.of(str).isAbsolute();
            if (!abs){
                Path path = Path.of(str).toAbsolutePath();
                System.out.println(path);
            } else {
                System.out.println(str);
            }
        } catch (Exception e){

        }
    }
}