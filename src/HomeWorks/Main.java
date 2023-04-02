package HomeWorks;

import static HomeWorks.First.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //////////////////////////////////////////////////////////////////// FIRST HOMEWORK
        // First task

        /*

        for (int i = 2; i <= 100; i++) {
            if (NumberIsSimple(i)) {
                System.out.println(i);
            }
        }

        */

        // Second task

        /*

        byte[] lamps = new byte[] { 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1,
                0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0,
                1, 0, 1, 0};

        Blink(lamps);
        Run(lamps);
        IsFirstLampOn(lamps);
        LampsToBinary(lamps);

        */

        // Third Task

        /*

        Scanner in = new Scanner(System.in);

        byte[] lamps = new byte[] { 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1,
                0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0,
                1, 0, 1, 0};

        int op = in.nextInt();

        switch (op) {
            case 1 -> {
                for (byte i = 1; i <= 10; i++) {
                    Blink(lamps);
                }
            }
            case 2 -> IsFirstLampOn(lamps);
            case 3 -> {
                for (byte i = 1; i <= 10; i++) {
                    Run(lamps);
                }
            }
            case 4 -> LampsToBinary(lamps);
        }

        */
    }
}
