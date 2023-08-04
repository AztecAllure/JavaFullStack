package Practiced.July12;

import java.util.*;

public class IndexRem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int removeIndex = sc.nextInt();
        for (int i = removeIndex; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}