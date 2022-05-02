package SimpleConditionStatements;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ягоди (цена и кг), банани (кг), портокали (кг), малини (кг)
        //цена на малини = цена на ягоди / 2
        //цена на портокали = цена на малини - 40%
        //цена на банани = цена на малини - 80%
        //обща сума = сума за ягоди (кг. ягоди * цена на ягоди)
        // + сума за банани (кг. банани * цена на банани)
        // + сума за портокали (кг. портокали * цена на портокали)
        // + сума за малини (кг. малини * цена на малини)

        double priceStrawberries = Double.parseDouble(scanner.nextLine());
        double quantityBanana = Double.parseDouble(scanner.nextLine());
        double quantityOranges = Double.parseDouble(scanner.nextLine());
        double quantityRaspberries = Double.parseDouble(scanner.nextLine());
        double quantityStrawberries = Double.parseDouble(scanner.nextLine());

        double priceRaspberries = priceStrawberries / 2;
        double priceOranges = priceRaspberries - 0.4 * priceRaspberries; //0.6 * priceRaspberries
        double priceBananas = priceRaspberries - 0.8 * priceRaspberries; //0.2 * priceRaspberries

        double totalPrice = (quantityStrawberries * priceStrawberries)
                + (quantityBanana * priceBananas)
                + (quantityOranges * priceOranges)
                + (quantityRaspberries * priceRaspberries);

        System.out.printf("%.2f", totalPrice);
    }
}
