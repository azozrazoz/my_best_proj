package HomeWorks.HackerRankDay8;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class PhoneBook {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<String, String>();
        Scanner scanner = new Scanner(System.in);

        int numFriends = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numFriends; i++) {
            String name = scanner.nextLine();
            String phone = scanner.nextLine();
            phoneBook.put(name, phone);
        }

        while (scanner.hasNext()) {
            String inputName = scanner.nextLine();

            if (phoneBook.containsKey(inputName)) {
                System.out.println(inputName + "=" + phoneBook.get(inputName));
            } else {
                System.out.println("Not found");
            }

        }
    }
}
