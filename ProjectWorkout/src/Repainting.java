import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylonQuantity = Integer.parseInt(scanner.nextLine());
        int paintQuantity = Integer.parseInt(scanner.nextLine());
        int razrQuantity = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double priceAllNylon = (nylonQuantity + 2) * 1.50;
        double priceAllPaint = (paintQuantity * 1.10) * 14.50;
        double priceAllRazr = razrQuantity * 5.0;

        double allSupplies = priceAllNylon + priceAllPaint + priceAllRazr + 0.40;

        double workSum = (allSupplies * 0.30) * hours;

        double result = allSupplies + workSum;

        System.out.println(result);
    }
}
