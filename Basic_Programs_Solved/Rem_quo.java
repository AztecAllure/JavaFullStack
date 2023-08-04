package Basic_Programs_Solved;

import java.util.*;

public class Rem_quo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        System.out.print("Remainder is: ");
        System.out.println(a % b);
        System.out.print("Quotient is: ");
        System.out.println(a / b);
        sc.close();
    }
}
