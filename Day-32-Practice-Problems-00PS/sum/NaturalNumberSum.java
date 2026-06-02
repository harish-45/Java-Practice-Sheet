
import java.util.Scanner;

public class NaturalNumberSum {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter a Natural Number : ");
            int n = sc.nextInt();
            int res = calculteSum(n);

            System.out.printf("The Sum of first '%d' Natural Numbers : %d", n, res);
        }
    }

    public static int calculteSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
