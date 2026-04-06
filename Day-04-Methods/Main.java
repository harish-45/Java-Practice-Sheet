import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a = in.nextInt();
        System.out.print("Enter second Number: ");
        int b = in.nextInt();


        Calculator calc = new Calculator();
        System.out.println("Addition of these two number: " + calc.add(a, b));
        System.out.println("Substraction of these two number: " + calc.subtract(a, b));
        System.out.println("multiplication of these two number: " + calc.multiply(a, b));
        System.out.println("Division of these two number: " + calc.divide(a, b));
        in.close();
    }
}
