package Files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamExample {
    public static void main(String[] args) {
        String txt = "Hello It Step";
        try (PrintStream printStream = new PrintStream("ItStep.txt");
             /*PrintStream ps = new PrintStream(fos)*/) {
            // ps.println(txt);
            // System.out.println("Recording in file exesuted");
            printStream.print("Hello IT Step!");
            printStream.println("Hello!!!");
            printStream.printf("Name: %s, Age: %d", "Tom", 20);
            String text = "PrintPrintPrintPrint";

            byte[] message_toBytes = text.getBytes();
            printStream.write(message_toBytes);
            System.out.print("The file has been written");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (PrintWriter printWriter = new PrintWriter(System.out)) {
            printWriter.println("Hello world!");
        }
    }
}
