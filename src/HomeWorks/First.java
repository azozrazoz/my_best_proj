package HomeWorks;

public class First {

    public static boolean NumberIsSimple(int num) {
        for (int j = 2; j < num / 2; j++){
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void Blink(byte[] lamps){
        for (byte i: lamps) {
            System.out.printf(" %d ", ~i);
        }

        System.out.println();
    }

    public static void Run(byte[] lamps){
        for (byte j: lamps) {
            System.out.printf(" %d ", j << 1);
        }

        System.out.println();
    }

    public static void IsFirstLampOn(byte[] lamps) {
        if ((lamps[0] & 1) == 1) {
            System.out.println("Первая лампа включена");
        }
        else {
            System.out.println("Первая лампа не включена");
        }
    }

    public static void LampsToBinary(byte[] lamps) {
        for (byte i: lamps) {
            System.out.printf(" %s ", Integer.toBinaryString(i));
        }
    }
}

