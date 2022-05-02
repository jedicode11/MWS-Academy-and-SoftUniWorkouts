import java.util.Scanner;

public class SuppliesForClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pensCount = Integer.parseInt(scanner.nextLine());
        int markersCount = Integer.parseInt(scanner.nextLine());
        int litersDetergent = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double sumPens = pensCount * 5.80;
        double sumMarkers = markersCount * 7.20;
        double sumDetergent = litersDetergent * 1.20;

        double allSuppliesSum = sumPens + sumMarkers + sumDetergent;

        double sumWithDiscount = allSuppliesSum - (allSuppliesSum * (percent / 100.0));

        System.out.println(sumWithDiscount);
    }
}
