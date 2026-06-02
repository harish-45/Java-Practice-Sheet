import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a Number : ");
            int n = sc.nextInt();
            boolean res = isPalindrome(n);

            System.out.printf("The given Number '%d' is Palindrome : %b", n, res);
        }
    }

    public static boolean isPalindrome(int n) {
        if(n > 0)
            return n == reverseNum(n);
        return n == reverseNumNegative(n);
    }

    private static int reverseNum(int n) {

        int reverse = 0;
        while (n > 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }
        return reverse;
    }

    private static int reverseNumNegative(int n) {

        int reverse = 0;
        while (n < 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }
        return reverse;
    }
}
