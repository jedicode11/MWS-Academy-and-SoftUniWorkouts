package ForWorkouts;

import java.util.Scanner;

public class PetFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());

        double totalBiscuit = 0; // общо грама бисквити
        double totalEatenFoodForAllDays = 0; // общо изядена храна от кучето и котката за всеки ден
        double totalEatenDog = 0; // общо изядена храна от кучето
        double totalEatenCat = 0; // общо изядена храна от котката

        for (int day = 1; day <= days; day++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());
            int foodPerDay = dogFood + catFood;
            if (day % 3 == 0) { //всеки трети ден
                //бисквити
                totalBiscuit += 0.1 * foodPerDay;
            }

            totalEatenFoodForAllDays += foodPerDay;
            totalEatenDog += dogFood;
            totalEatenCat += catFood;
        }

        System.out.printf("Total eaten biscuits: %.0fgr.%n", Math.floor(totalBiscuit));
        double percentEatenFood = totalEatenFoodForAllDays / totalFood * 100;
        System.out.printf("%.2f%% of the food has been eaten.%n", percentEatenFood);
        double percentDog = totalEatenDog / totalFood * 100;
        System.out.printf("%.2f%% eaten from the dog.%n", percentDog);
        double percentCat = totalEatenCat / totalEatenFoodForAllDays * 100;
        System.out.printf("%.2f%% eaten from the cat.", percentCat);
    }
}
