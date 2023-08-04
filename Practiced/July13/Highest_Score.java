package Practiced.July13;

import java.util.Scanner;

public class Highest_Score {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n = sc.nextInt();
        String namArr[] = new String[n];
        int scorArr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            namArr[i] = sc.next();
            System.out.print("Score: ");
            scorArr[i] = sc.nextInt();
        }
        int highest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (scorArr[i] > highest) {
                highest = scorArr[i];
            }
        }
        System.out.print("Highest: " + highest);
        sc.close();

    }
}
