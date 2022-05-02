import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Обща сума за филм = бр. дни * цена за 1 ден (зависи от сезона и дестинацията)
        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        //"Dubai", "Sofia" и "London"
        String season = scanner.nextLine();
        //"Summer" и "Winter"
        int count = Integer.parseInt(scanner.nextLine());

        double pricePerDay = 0; //цена за 1 ден
        if (season.equals("Summer")) {
            //лято -> проверка за дестинацията
            if (destination.equals(("Dubai"))) {
                pricePerDay = 40000;
            } else if (destination.equals("Sofia")) {
                pricePerDay = 12500;
            } else if (destination.equals("London")) {
                pricePerDay = 20250;
            }
        } else if (season.equals("Winter")) {
            //зима
            if (destination.equals("Dubai")) {
                pricePerDay = 45000;
            } else if (destination.equals("Sofia")) {
                pricePerDay = 17000;
            } else if (destination.equals("London")) {
                pricePerDay = 24000;
            }
        }

        double totalSum = count * pricePerDay; //обща сума за филма

        //отстъпки / облагания
        if (destination.equals("Dubai")) {
            totalSum = totalSum - 0.3 * totalSum; //0.7 * totalSum
        } else if (destination.equals("Sofia")) {
            totalSum = totalSum + 0.25 * totalSum; //1.25 * totalSum
        }

        if (budget >= totalSum) {
            //достатъчен
            double leftBudget = budget - totalSum;
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", leftBudget);
        } else {
            //не е достатъчно
            //budget < totalSum
            double needSum = totalSum - budget;
            System.out.printf("The director needs %.2f leva more!", needSum);
        }

    }
}
