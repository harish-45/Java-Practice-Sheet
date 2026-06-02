import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter principal ammount : ");
            double principal = sc.nextDouble();

            System.out.print("Enter Interest rate : ");
            double rate = sc.nextDouble();

            System.out.print("Enter Time (in year) : ");
            double time = sc.nextDouble();

            System.out.println("\nYour Simple Interest : " + printInterest(principal, rate, time));
        }
    }

    public static double printInterest(double principal, double rate, double time) {
        return principal * rate * time / 100;
    }

}
