package Practiced.July29;

import java.util.Scanner;

public class DuplicateWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (character == str.charAt(j)) {
                    count++;
                    str = str.substring(0, j) + str.substring(j + 1);
                    j--;
                }
            }
            if (count > 1) {
                System.out.printf("%c has apperead %d times.%n", character, count);
            }
        }
        sc.close();
    }
}