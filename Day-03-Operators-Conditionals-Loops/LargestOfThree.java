import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the first Number: ");
        int a = in.nextInt();
        System.out.print("Enter the second Number: ");
        int b = in.nextInt();
        System.out.print("Enter the third Number: ");
        int c = in.nextInt();

        if (a > b && a > c) {
            System.out.println("the largest number is: " + a );
        } else if (b>a && b>c) {
            System.out.println("the largest number is: " + b );
        } else {
            System.out.println("the largest number is: " + c );
        }

        in.close();
    }
}
