import java.util.Scanner;

public class ArraySumCalculator {
    public static void main(String[] args) {
        //  (!==) ;
        // in the first case (int[] nums, sum;) nums & sum both are array of integer
        // in second case (int nums[], sum) nums is array of interger & sum is a variable

        int nums[] ,sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of elements : ");
            int n = sc.nextInt();

            System.out.print("Enter Elements of Array : ");
            nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
        }

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println("The Sum of Array : " + sum);
    }
}
