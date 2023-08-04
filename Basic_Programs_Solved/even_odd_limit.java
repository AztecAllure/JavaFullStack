package Basic_Programs_Solved;

import java.util.*;

public class even_odd_limit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 100) {
            if (a % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } else {
            System.out.println("number is below 100");
        }
        sc.close();
    }
}
