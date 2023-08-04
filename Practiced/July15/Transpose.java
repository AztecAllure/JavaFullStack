package Practiced.July15;

import java.util.*;

public class Transpose {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Rows and Columns: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int temp[][] = new int[n][n];
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                temp[i][j] = arr[j][i];
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}