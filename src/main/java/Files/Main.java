package Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            //проверка на пустую строку
            if (str.isEmpty()) {
                break;
            }
            if (Files.isRegularFile(Path.of(str))) {
                System.out.println(str + THIS_IS_FILE);
            } else if (Files.isDirectory(Path.of(str))) {
                System.out.println(str + THIS_IS_DIR);
            } else {
                break;
            }
        }
    }
}