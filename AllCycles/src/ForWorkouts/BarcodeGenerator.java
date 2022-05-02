package ForWorkouts;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        //цифри на startNumber
        int startUnits = startNumber % 10;
        int startTens = startNumber / 10 % 10;
        int startHundreds = startNumber / 100 % 10;
        int startThousands = startNumber / 1000;

        int endNumber = Integer.parseInt(scanner.nextLine());
        //цифри на endNumber
        int endUnits = endNumber % 10;
        int endTens = endNumber / 10 % 10;
        int endHundreds = endNumber / 100 % 10;
        int endThousand = endNumber / 1000;
        //всички числа между startNumber и endNumber -> опечатвам само числата с нечетни цифри
        for (int number = startNumber; number < endNumber; number++) {
            //проверка дали всички цифри са нечетни -> отпечатване
            //8756
            int units = number % 10; //единици
            int tens = number / 10 % 10; //десетици
            int hundreds = number / 100 % 10; //стотици
            int thousands = number / 1000; //хилядни

            //всяка цифра трябва да е нечетна
            //всяка цифра да е в определен диапазон

            //единици -> [startUnits; endUnits]
            //десетици -> [startTens; endTens]
            //стотици -> [startHundreds; endHundreds]
            //хилядни -> [startThousands; endThousands]
            boolean isValidUnits = units >= startUnits && units <= endUnits && units % 2 != 0;
            boolean isValidTens = tens >= startTens && tens <= endTens && tens % 2 != 0;
            boolean isValidHundreds = hundreds >= startHundreds && hundreds <= endHundreds && thousands % 2 != 0;
            boolean isValidThousands = thousands >= startThousands && thousands <= endThousand && thousands % 2 != 0;
            if (isValidUnits && isValidTens && isValidHundreds && isValidThousands) {
                System.out.print(number + " ");
            }
        }
    }
}