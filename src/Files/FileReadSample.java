package Files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileReadSample {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("ItStep.txt")) {
            char[] buffer = new char[256];
            int i;
            while ((i=reader.read()) != -1) {
                System.out.print((char) i);
                if (i < 256) {
                    buffer = Arrays.copyOf(buffer, i);
                }
                // System.out.print(buffer);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
