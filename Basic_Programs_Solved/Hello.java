package Basic_Programs_Solved;

import java.util.*;

public class Hello {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        if (a % 5 == 0) {
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }
        sc.close();
    }
}
