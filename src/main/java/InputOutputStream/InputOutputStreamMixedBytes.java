package InputOutputStream;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Не решена
 */
public class InputOutputStreamMixedBytes {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            int size = 1024;
            byte[] buffer = new byte[size];
            while (inputStream.available() > 0) {
                int read = inputStream.read(buffer);
                for (int i = 0; i < buffer.length; i++)
                {System.out.println(buffer[i]);}
                /**
                for (int i = 0; i < buffer.length - 1; i++){
                    for (int j = 0; j < buffer.length - i - 1; j++){
                        byte swap = buffer[j];
                        buffer[j] = buffer[j + 1];
                        buffer[j + 1] = swap;
                    }
                }
                 **/
                outputStream.write(buffer, 0, read);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
