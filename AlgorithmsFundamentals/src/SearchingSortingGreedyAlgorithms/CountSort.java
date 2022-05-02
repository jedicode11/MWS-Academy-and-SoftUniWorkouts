package SearchingSortingGreedyAlgorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CountSort {

    public static int[] counts;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {12, 5, 2, 2, 5};

        Integer max = Collections.max(Arrays.asList(12, 5, 2, 2, 5));
        
        counts = new int[max + 1];
        
        sort(arr);
        
        for (int index = 0; index < counts.length; index++) {
            if (counts[index] != 0) {
                for (int i = 0; i < counts[index]; i++) {
                    System.out.print(index + " ");
                }
            }
        }
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            counts[arr[i]]++;
        }
    }
}
