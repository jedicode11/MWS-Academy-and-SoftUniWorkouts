public class MultiplicationTable {
    public static void main(String[] args) {

        for (int first = 1; first <= 10; first++) {
            for (int second = 1; second <= 10; second++) {
                int product = first * second;
                System.out.println(first + " * " + second + " = " + product);
            }
        }
    }
}