package Practiced.July6;

import java.util.*;

public class ArrayProblemsSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        // arr[0]=1
        // arr[1]=2
        // arr[2]=3
        // arr[3]=4
        // arr[4]=5
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sumOfAllArrayElements(arr);
        sc.close();
    }

    public static void sumOfAllArrayElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

}