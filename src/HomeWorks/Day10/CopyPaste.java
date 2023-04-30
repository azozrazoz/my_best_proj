package HomeWorks.Day10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CopyPaste {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("ItStep.txt")) {
            String buffer = "";
            int i;
            while ((i=reader.read()) != -1) {
                buffer += (char) i;
            }

            try (FileWriter writer = new FileWriter("ItStepNew.txt", false)) {
                writer.write(buffer);

                writer.append('\n');
                writer.append("File was changed");
                writer.flush();
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
            System.out.print("Copy past was completed!");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}