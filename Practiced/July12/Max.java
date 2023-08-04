package Practiced.July12;

import java.util.Scanner;

public class Max {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int j = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > j) {
                j = arr[i];
            }

        }
        System.out.println(j);
        sc.close();
    }
}
