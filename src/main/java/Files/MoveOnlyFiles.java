package Files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Перемещение файлов
*/

public class MoveOnlyFiles {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //напишите тут ваш код
        try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)){
            for(Path path : files){
                if (Files.isRegularFile(path)) {
                    Path resolvedPath = targetDirectory.resolve(path.getFileName());//используем resolve для разрешения пути
                    Files.move(path, resolvedPath);
                }
            }
        }
    }
}