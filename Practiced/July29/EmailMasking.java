package Practiced.July29;

import java.util.Scanner;

public class EmailMasking {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Email ID: ");
        String str = sc.nextLine();
        StringBuffer front = new StringBuffer();
        String parts[] = str.split("@");
        String username = parts[0];
        String domain = parts[1];

        for (int i = 0; i < username.length(); i++) {
            char character = username.charAt(i);
            if (i < 2) {
                front.append(character);
            } else {
                front.append('x');
            }

        }
        front.append('@');
        System.out.println(front + domain);

        sc.close();
    }
}
