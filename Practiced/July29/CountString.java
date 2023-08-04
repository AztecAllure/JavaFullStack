package Practiced.July29;

import java.util.Scanner;

public class CountString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        StringBuilder numberString = new StringBuilder();
        int result = 1;
        int number;

        for (int i = 0; i < str.length(); i++) {
            char charac = str.charAt(i);
            if (Character.isDigit(charac)) {
                numberString.append(charac);
            } else {
                if (numberString.length() > 0) {
                    number = Integer.parseInt(numberString.toString());
                    result *= number;
                    numberString.setLength(0);
                }
            }
        }
        if (numberString.length() > 0) {
            number = Integer.parseInt(numberString.toString());
            result *= number;
        }
        System.out.println(str + result);
        sc.close();
    }
}
