package Collections;

import java.util.ArrayDeque;

public class ArrayDeqExample {
    public static void main(String[] args) {
        ArrayDeque<String> oblasti = new ArrayDeque<String>();

        oblasti.add("Almaty");
        oblasti.addFirst("Zhetisu");
        oblasti.push("Karaganda");
        oblasti.addLast("Akmolinskaya");
        oblasti.add("Taraz");
        oblasti.add("Turkestan");

        String st = oblasti.getFirst();
        System.out.println(st);

        String last = oblasti.getLast();
        System.out.println(last);

        System.out.printf("Queue size %d", oblasti.size());

        while(oblasti.peek() != null) {
            System.out.println(oblasti.pop());
        }
    }
}
