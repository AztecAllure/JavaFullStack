package Practiced;

import java.util.*;

public class ForLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to print 10 Times: ");
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a);
        }
        sc.close();
    }
}