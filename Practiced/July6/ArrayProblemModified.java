package Practiced.July6;

import java.util.Scanner;

public class ArrayProblemModified {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int arr[] = new int[N];
        for (int index = 0; index < N; index++) {
            int element = scanner.nextInt();
            arr[index] = element;
        }
        System.out.println("----------------");
        sumOfAllArrayElements(arr);

        scanner.close();
    }

    public static void sumOfAllArrayElements(int[] arr) {
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        System.out.println(sum);
    }
}
