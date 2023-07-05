package InputOutputStream;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFilesReader {
    public static void main(String[] args) {
        String src = "c:\\projects\\log.txt";
        String dest = "c:\\projects\\copy.txt";

        try(FileReader reader = new FileReader(src); //Reader для чтения из файла
            FileWriter writer = new FileWriter(dest)) //Writer для записи в файл
        {
            char[] buffer = new char[65536]; // 64Kb Буфер, в который будем считывать данные
            while (reader.ready()) //Пока данные есть в потоке
            {
                int real = reader.read(buffer); //Читаем данные в буфер
                writer.write(buffer, 0, real); //Записываем данные из буфера во второй поток(содержимое буфера, с 0го байта, по размеру)
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}