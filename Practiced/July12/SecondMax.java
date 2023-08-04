package Practiced.July12;

import java.util.*;

public class SecondMax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int highest = Integer.MIN_VALUE;
        int SecHig = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                SecHig = highest;
                highest = arr[i];
            }
            if (arr[i] < highest && arr[i] > SecHig) {
                SecHig = arr[i];
            }
        }
        System.out.println(SecHig);

        sc.close();
    }
}