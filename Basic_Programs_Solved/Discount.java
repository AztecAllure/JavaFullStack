package Basic_Programs_Solved;

import java.util.*;

public class Discount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a <= 1000) {
            System.out.println("no discount");
        } else if (a >= 1001 && a <= 2000) {
            System.out.println("5 % discount");
        } else if (a >= 2001 && a <= 5000) {
            System.out.println("10 % discount");
        } else if (a > 5000) {
            System.out.println("20 % discount");
        }
        sc.close();
    }
}
