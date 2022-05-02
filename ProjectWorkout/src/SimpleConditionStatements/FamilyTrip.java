package SimpleConditionStatements;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //обща сума за почивка = сума за нощувки + допълнителни разходи
        //сума за нощувки = бр. нощувки * цена за 1 нощувка
        //допълнителни разходи = процент от бюджета

        double budget = Double.parseDouble(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        if (count > 7) {
            pricePerNight = pricePerNight - 0.05 * pricePerNight;
            //0.95 * pricePerNight;
        }
        double sumNights = count * pricePerNight;
        double sumAddExpenses = (percent / 100.0) * budget;
        double totalSum = sumNights + sumAddExpenses;

        //ако бюджетът е достатъчен
        if (budget >= totalSum) {
            double leftMoney = budget - totalSum;
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", leftMoney);
        } else {
            //budget < totalSum
            double needMoney = totalSum - budget;
            System.out.printf("%.2f leva needed.", needMoney);
        }

    }
}
