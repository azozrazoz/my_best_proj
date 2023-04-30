package HomeWorks;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Hashtable;

public class Day_6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Hashtable<String, Integer> table = new Hashtable<>();
        Enumeration<String> keys = table.keys();

        try {
            try {
                int x = new Integer(sc.nextInt());
                int y = new Integer(sc.nextInt());
                try {
                    System.out.println(x / y);
                }
                catch (ArithmeticException e) {
                    System.out.println("java.lang.ArithmeticException: / by zero");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("java.util.InputMismatchException");
            }

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}