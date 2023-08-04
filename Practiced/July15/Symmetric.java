package Practiced.July15;

import java.util.*;

public class Symmetric {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean isSymmetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (isSymmetric == false) {
                break;
            }
        }
        if (isSymmetric == false) {
            System.out.println("Not Symmetric");
        } else {
            System.out.println("Symmetric");
        }
        sc.close();
    }
}