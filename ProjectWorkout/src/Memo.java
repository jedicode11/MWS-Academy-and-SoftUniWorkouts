import java.util.Scanner;

public class Memo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        double age = Double.parseDouble(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.printf("You are %s %s, a %.3f-years old person from %s.%n",
                firstName, lastName, age, town);

        System.out.println(age);
    }
}
