public class Test {
    public static void main(String[] args) {

        try {
            int num = 420;
            double res = devide(num, 0);
            System.out.println("Answer : " + res);
        } catch (ArithmeticException e) {
            System.out.println("An ArithmeticException found : " + e);
        } finally {
            System.out.println("operations complete");
        }

    }

    public static double devide(int n, int d) {
        return n / d;
    }
}
