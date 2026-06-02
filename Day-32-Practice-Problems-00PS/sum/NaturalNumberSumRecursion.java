import java.util.Scanner;

public class NaturalNumberSumRecursion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter a Natural Number : ");
            int n = sc.nextInt();
            int res = calculteSum(n);

            System.out.printf("The Sum of first '%d' Natural Numbers : %d", n, res);
        }
    }

    public static int calculteSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + calculteSum(n - 1);
    }
}

