package HomeWorks;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.System.*;

import static java.lang.System.out;

public class Day_3 {
    public static void main(String[] args){

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        Adder adder = new Adder();

        out.println(Adder.class);
        out.println(adder.Add(12, 30));

    }
}
class Animal{
    void walk(){
        out.println("I am walking");
    }
}

class Bird extends Animal {
    void fly() {
        out.println("I am flying");
    }

    void sing() {
        out.println("I am singing");
    }
}

class Arithmetic {
    public int Add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {

}