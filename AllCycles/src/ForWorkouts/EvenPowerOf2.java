package ForWorkouts;

import java.util.Scanner;

public class EvenPowerOf2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

            for (int step = 0; step <= n; step++) {
                if (step % 2 == 0) {
                    System.out.println(Math.pow(2, step));
                }
            }
        }
}
