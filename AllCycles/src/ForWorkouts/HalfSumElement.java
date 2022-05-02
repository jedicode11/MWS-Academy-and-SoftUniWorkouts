package ForWorkouts;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            sum = sum + currentNum;

            if (currentNum < minNum) {
                minNum = currentNum;
            }
            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
        }

        int sumWithoutMaxNum = sum - maxNum;
        if (maxNum == sumWithoutMaxNum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumWithoutMaxNum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(maxNum - sumWithoutMaxNum ));
        }
    }
}
