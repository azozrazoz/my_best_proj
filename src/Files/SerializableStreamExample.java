package Files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableStreamExample {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("person.dat"))) {
            Person2 person2 = new Person2("Maqsat", 18, 180, false);
            oos.writeObject(person2);
        }
        catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
class Person2 {
    public String name;
    public int age;
    public double height;
    public boolean married;
    public Person2(String s, int n, double h, boolean m) {
        this.name = s;
        this.age = n;
        this.height = h;
        this.married = m;
    }
    String getName() { return name; }
    int getAge() { return age; }
    double getHeight() { return height; }
    boolean getMarried() { return married; }
}
