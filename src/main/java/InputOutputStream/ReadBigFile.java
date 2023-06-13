package InputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadBigFile {
    public static void main(String[] args) throws IOException {
        String src = "c:\\temp\\log.txt";
        String dest = "c:\\temp\\copy.txt";

        try(FileInputStream input = new FileInputStream(src);// чтение из файла
            FileOutputStream output = new FileOutputStream(dest))//запись в файл
        {
            byte[] buffer = new byte[65536]; // 64Kb Буфер, в который считываем данные
            while (input.available() > 0)    // Пока данные есть в потоке
            {
                int real = input.read(buffer);//Считываем данные в буфер
                output.write(buffer, 0, real);//Записываем данные из буфера во второй поток
            }
        }
    }
}
