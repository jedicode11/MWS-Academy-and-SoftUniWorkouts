package SimpleConditionStatements;

public class MultiTable {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d",(i + 1) * (j + 1));
            }
        }
    }
}
