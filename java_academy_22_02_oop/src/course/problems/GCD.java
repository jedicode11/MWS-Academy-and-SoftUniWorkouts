package course.problems;

import java.util.Scanner;

public class GCD {
    public static int getGCD(int a, int b) {

        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int a = 0;
        int b = 0;
        for (int i = 1; i <= y; i++) {
            String result = scanner.nextLine();

            if (i > 1) {

                break;
            }

            System.out.printf("GCD of %d and %d = %d", x, y, getGCD(x, y));
        }
    }
}
