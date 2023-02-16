package Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
public class FileOperation {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        //напишите тут ваш код
        if (Files.exists(filePath)){
            if (Files.exists(fileNewPath)){
                Files.delete(filePath);
            } else {
                Files.move(filePath, fileNewPath);
            }
        } else {
            Files.createFile(filePath);
        }
    }
}
