package WhileCicle;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());



        int spendingCountDays = 0;
        int totalDays = 0;
        boolean isFailed = false;
        while (availableMoney < neededMoney) {
            if (spendingCountDays >= 5) {
                isFailed = true;
                break;
            }
            String action = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());

            totalDays++;

            if (action.equals("spend")) {
                spendingCountDays++;
                availableMoney = availableMoney - amount;
                if (availableMoney < 0) {
                    availableMoney = 0;
                }
            } else if (action.equals("save")) {
                spendingCountDays = 0;
                availableMoney = availableMoney + amount;
            }
        }

        if (isFailed) {
            System.out.println("You can't save the money.");
            System.out.println(totalDays);
        } else {
            System.out.printf("You saved the money for %d days.", totalDays);
        }
    }
}
