package HomeWorks.Day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
public class FileInputOutputStreamDemo {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("ile.txt");
             InputStream input = new FileInputStream("copied_file.txt")) {
            char[] symbols = {'a', 'b', 'c'};

            for (char symbol : symbols) {
                // Запись каждого символа в текстовый файл
                output.write(symbol);
            }
            output.close();
            int size = input.available();

            for (int i = 0; i < size; i++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
