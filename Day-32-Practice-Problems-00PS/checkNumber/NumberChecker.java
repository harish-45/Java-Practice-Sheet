import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input a Integer : ");
            int num = sc.nextInt();

            if (num > 0) {
                System.out.printf("Given number '%d' is Positive...", num);
            } else if (num < 0) {
                System.out.printf("Given number '%d' is Negative...", num);
            } else {
                System.out.printf("Given number '%d' is Zero...", num);
            }
        }
        ;
    }
}
