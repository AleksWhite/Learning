package Files;

import java.nio.file.Path;
import java.util.Scanner;

/*
Зри в корень
*/

public class FindRootPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //напишите тут ваш код
        //Поиск корневой директории
        Path path = Path.of(str).getRoot();
        System.out.println(path);
    }
}