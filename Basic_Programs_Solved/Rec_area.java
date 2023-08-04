package Basic_Programs_Solved;

import java.util.*;

public class Rec_area {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int Area = length * breadth;
        System.out.println("Area of the Rectangle is: ");
        System.out.print(Area);
        sc.close();
    }
}
