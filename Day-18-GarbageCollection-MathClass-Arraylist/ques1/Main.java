
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter Second Number : ");
        double num2 = sc.nextDouble();

        System.out.println("MAX Number is : " + Math.max(num1, num2));
        System.out.println("MIN Number is : " + Math.min(num1, num2));

        System.out.println("Square_root of the absolute difference between the two numbers : "
                + Math.sqrt(Math.abs(num1 - num2)));

        System.out.println("power of the first number raised to the second number : " + Math.pow(num1, num2));
        
        sc.close();
    }
}
