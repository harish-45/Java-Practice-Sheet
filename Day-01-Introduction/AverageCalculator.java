import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();

        // double avg = (a + b) / 2;  
        // {a = 4 , b = 5}  it gives 4.0 bcs Both 9 and 2 are integers, so Java performs integer division.

        double avg = (a + b) / 2.0;
        System.out.println("the Average of these two number is : " + avg);

        in.close();
    }
}
