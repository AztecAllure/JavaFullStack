package Basic_Programs_Solved;

import java.util.*;

public class Bmi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Weight: ");
        double weight = sc.nextDouble();
        System.out.print("Enter Height: ");
        double height = sc.nextDouble();
        System.out.print("BMI is: ");
        System.out.println(weight * height);
        sc.close();

    }
}
