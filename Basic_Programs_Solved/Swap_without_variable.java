package Basic_Programs_Solved;

import java.util.*;

public class Swap_without_variable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
        sc.close();

    }
}