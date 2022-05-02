package SimpleConditionStatements;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearTax = Integer.parseInt(scanner.nextLine());

        double priceShoes = yearTax * 0.60;
        double priceSuit = priceShoes - (priceShoes * 0.20);
        double priceBall = priceSuit / 4;
        double priceAcc = priceBall / 5;

        double totalSum = priceShoes + priceSuit + priceBall + priceAcc + yearTax;

        System.out.println(totalSum);
    }
}