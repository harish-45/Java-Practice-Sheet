import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter first number: ");
        int b = in.nextInt();

        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        double quotient = (double) a / b;

        System.out.println("sum is: " + sum);
        System.out.println("difference is: " + diff);
        System.out.println("product is: " + product);
        System.out.println("quotient is: " + quotient);

        in.close();
    }
}
