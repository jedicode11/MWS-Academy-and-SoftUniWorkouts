package WhileCicle;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMoney = 0;
        String input = scanner.nextLine();
        while (!input.equals("NoMoreMoney")) {

            double sum = Double.parseDouble(input);

            if (sum < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                System.out.printf("Increase: %.2f%n", sum);
                totalMoney += sum;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total: %.2f", totalMoney);
    }
}
