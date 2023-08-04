package Basic_Programs_Solved;

import java.util.*;

public class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Digit to add: ");
        int a = sc.nextInt();
        System.out.print("Enter Another Number to add: ");
        int b = sc.nextInt();
        System.out.print("Sum is : ");
        System.out.println(a + b);
        int c = a + b;
        System.out.print("Sum is : ");
        System.out.println(c);
        sc.close();

    }
}