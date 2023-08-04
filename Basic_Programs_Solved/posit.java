package Basic_Programs_Solved;

import java.util.*;

public class posit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("+ve");
        } else if (a < 0) {
            System.out.println("-ve");
        } else {
            System.out.println("zero");
        }
        sc.close();
    }

}
