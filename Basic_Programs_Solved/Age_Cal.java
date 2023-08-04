package Basic_Programs_Solved;

import java.util.*;

public class Age_Cal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Birth Year: ");
        int Birth_year = sc.nextInt();
        int age = 2023 - Birth_year;
        System.out.println(age);
        sc.close();
    }
}
