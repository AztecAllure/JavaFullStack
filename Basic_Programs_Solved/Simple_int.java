package Basic_Programs_Solved;

import java.util.*;

public class Simple_int {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int in_pri_bal = 5000;
        int ann_int_rate = 5;
        int time = sc.nextInt();
        System.out.print("Simple Intrest is: ");
        int a = (in_pri_bal * ann_int_rate * time) / 100;
        System.out.println(a);
        sc.close();
    }
}
// a = p(1+rt)
// a = in_pri_bal(1+ann_int_rate(time))