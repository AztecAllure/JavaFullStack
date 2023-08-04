package Basic_Programs_Solved;

import java.util.*;

public class Swap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a: ");
        int a = sc.nextInt();
        System.out.println("Enter number to swap with a: ");
        int b = sc.nextInt();
        System.out.print("Numbers before swapping: ");
        System.out.println(a);
        System.out.println(b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
        sc.close();
    }
}