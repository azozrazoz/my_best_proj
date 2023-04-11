package Collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>(5);
        people.add("Bob");
        people.add("John");
        people.add("Tom");
        people.add("Dan");
        people.add("Alan");
        people.add("Smith");

        // people.trimToSize();
        // people.ensureCapacity(300);
        System.out.println(people.get(3));
        people.set(3, "Mike");
        System.out.println(people.get(3));
        System.out.printf("Size of ArrayList = %d\n", people.size());
        System.out.println(people.lastIndexOf("Smith"));

        if(people.contains("John")) {
            System.out.println("ArrayList contains name John");
        }
        else {
            System.out.println("ArrayList not contains name John");
        }
        people.remove("Smith");
        people.remove(0);

        for(String n: people) {
            System.out.printf("People -> %s\n", n);
        }

        System.out.println();

        Object[] peopleArray = people.toArray();

        for (Object p: peopleArray) {
            System.out.printf("People -> %s\n", p.toString());
        }
    }
}

