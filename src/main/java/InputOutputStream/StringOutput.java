package InputOutputStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/*
Пропускаем не всех
*/

public class StringOutput {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        List<String> lines = Files.readAllLines(Path.of(scanner.nextLine()));

        for (int i = 0; i < lines.size(); i += 2) {
            System.out.println(lines.get(i));
        }
    }
}