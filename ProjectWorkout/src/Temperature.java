import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius");

        double celsius = Double.parseDouble(scanner.nextLine());

        double fahrenheit = ((celsius *1.8)+32);

        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }
}
