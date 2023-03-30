import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        /*final int age = 10;
        String name = "David";
        char gender = 'M';
        float height = 1.55F;
        double weight = 34.3D;
*/

        int age;
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
                name, age, gender, height, weight);

    }
}