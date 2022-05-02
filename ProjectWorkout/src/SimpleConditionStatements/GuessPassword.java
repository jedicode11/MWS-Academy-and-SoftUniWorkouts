package SimpleConditionStatements;

import java.util.Scanner;

public class GuessPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. парола (текст)
        //2. проверка за паролата
            //ако паролата е "s3cr3t!P@ssw0rd" -> "Welcome"
            //ako parolata ne e -> "Wrong password!"
        String password = scanner.nextLine();
        if (password.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}