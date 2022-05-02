package SimpleConditionStatements;

import java.util.Scanner;

public class Number100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. цяло число
        //2. проверка за числото
            //под 100 -> "Less than 100:
            //do 200 (вкл) -> "Between 100 and 200"
            //над 200 -> "Greater than 200"
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 100) {
            System.out.println("Less than 100");
        } else if (number <= 200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }
    }
}
