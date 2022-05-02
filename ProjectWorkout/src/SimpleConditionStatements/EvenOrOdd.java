package SimpleConditionStatements;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. цяло число
        //2. проверка дали е четно
            //ако е четно -> even
            //ако е нечетно -> odd
        //когато делим на 2 -> иамме остатък 0 и 1
        int number = Integer.parseInt(scanner.nextLine());
        if (number % 2 == 0) {
            System.out.println("even");
        } else { //number % 2 != 0
            System.out.println("odd");
        }
    }
}