package Files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("ItStep.txt", false)) {
            String text = "Hello Teachers!!!";
            writer.write(text);

            writer.append('\n');
            writer.append('A');
            writer.flush();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
