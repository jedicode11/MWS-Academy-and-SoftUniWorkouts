package SimpleConditionStatements;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        double area = 0;
        if (figure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());

            area = a * a;
        } else if (figure.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());

            area = sideA * sideB;

        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());

            area = Math.PI * r * r;
        } else if (figure.equals("triangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());

            area = (sideA * h) / 2;
        }

        System.out.printf("%.3f", area);
    }
}