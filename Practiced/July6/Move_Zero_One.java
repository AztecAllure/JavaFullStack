package Practiced.July6;

import java.util.*;

public class Move_Zero_One {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        String Zeros = "";
        String Ones = "";
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                Zeros = Zeros + arr[i];
            } else if (arr[i] == 1) {
                Ones = Ones + arr[i];
            }
        }
        System.out.println(Ones + Zeros);
        sc.close();
    }
}
