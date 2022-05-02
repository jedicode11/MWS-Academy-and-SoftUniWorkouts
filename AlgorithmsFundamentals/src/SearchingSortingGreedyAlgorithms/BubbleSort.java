package SearchingSortingGreedyAlgorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};
        sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
