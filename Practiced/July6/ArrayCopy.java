package Practiced.July6;

import java.util.*;

public class ArrayCopy {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
            // To Print Reverse Array
            // arr2[n - 1 - i] = arr1[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i]);
        }
        sc.close();
    }
}
