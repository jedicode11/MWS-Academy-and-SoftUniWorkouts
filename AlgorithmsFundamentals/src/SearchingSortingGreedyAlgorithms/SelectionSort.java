package SearchingSortingGreedyAlgorithms;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {5, 4, 3, 2, 1};

        sort(arr);

        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            swap(arr, i, index);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
