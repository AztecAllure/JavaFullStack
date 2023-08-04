package Practiced.July15;

import java.util.*;

public class Determin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int left = 1;
        int right = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    left = left * arr[i][j];
                } else {
                    right = right * arr[i][j];
                }
            }

        }
        System.out.println("ab-cd = " + (left - right));
        sc.close();
    }
}
