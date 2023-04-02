package ExampleStepAcademy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*final int age = 10;
        String name = "David";
        char gender = 'M';
        float height = 1.55F;
        double weight = 34.3D;
*/

        /*int age;
        String name;
        char gender;
        float height;
        double weight;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter pls your age (min 18): ");
        age = in.nextInt();
        System.out.print("Enter pls your name: ");
        name = in.nextLine();
        System.out.print("Enter pls your gender (M or W): ");
        gender = in.next().charAt(0);
        System.out.print("Enter pls your height: ");
        height = in.nextFloat();
        System.out.print("Enter pls your weight: ");
        weight = in.nextDouble();

        System.out.printf("Name: %s,\nAge: %d,\nGender: %c,\nHeight: %f\nWeight: %f",
                name, age, gender, height, weight);*/

        int[] n = new int[10];

        n = new int[100];
        int[] n2 = {1, 2, 3, 4, 5, 6};

        n2[1] = 5;

        int length = n2.length;

        int last = n2[n2.length - 1];

        int[][] n3 = {{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < n2.length; i++) {
            System.out.println(n2[i]);
        }
        firstMethod(1, 2, 3, 4, 4, 4, 4, 4);

        int x = sum(3, 4);
        int y = sum(6, 6);

        System.out.printf("%d %d", x, y);

    }

    static void firstMethod(int... a){
        for (int i:a){
            System.out.printf("*** Hello It step, %d", i);
            System.out.println();
        }
    }

    static void secondMethod(int c, int d){
        System.out.println();
        System.out.printf("*** Hello It step, %d", c + d);
    }

    static int sum(int x, int y){
        return x + y;
    }
}

class Car{
    String color = "White";

    Car(){
        this("color");
    }

    public Car(String color){
        this.color = color;
    }

    void Color(){
        System.out.printf("%s", color);
    }
    void Beep(){
        System.out.println("BEEEEEEEEEEEEEEEEEEEEEEEEP");
    }
}
