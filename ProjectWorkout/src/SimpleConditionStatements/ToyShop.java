package SimpleConditionStatements;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddyCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());

        double allSum = (puzzleCount * 2.60) +
                (dollsCount * 3.0) +
                (teddyCount * 4.10) +
                (minionsCount * 8.20) +
                (truckCount * 2.0);

        int countAllToys = puzzleCount + dollsCount + teddyCount +
                minionsCount + truckCount;

        if (countAllToys >= 50) {
            allSum = allSum - (allSum * 0.25);
        }

        allSum = allSum - (allSum * 0.10);

        double diff = Math.abs(allSum - tripPrice);
        if (allSum >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
