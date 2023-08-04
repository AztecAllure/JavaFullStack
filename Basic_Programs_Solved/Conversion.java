package Basic_Programs_Solved;

import java.util.*;

public class Conversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to convert: ");
        double a = sc.nextDouble();
        System.out.print("After Converting into centi meters: ");
        System.out.println(a * 100);
        System.out.print("After Converting into milli meters: ");
        System.out.println(a * 1000);
        sc.close();

    }
}
