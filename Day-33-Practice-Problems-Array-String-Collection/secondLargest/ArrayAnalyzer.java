import java.util.Arrays;
import java.util.Scanner;

public class ArrayAnalyzer {
    public static void main(String[] args) {
        int[] nums;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of elements : ");
            int n = sc.nextInt();

            System.out.print("Enter Elements of Array : ");
            nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
        }
            
            System.out.println("Array : " + Arrays.toString(nums));
            int res = secondLargest(nums);
            System.out.println("Second largest in Array : "  + res );
    }

    public static int secondLargest(int[] arr) {
        int largest = arr[0];
        int seclarge = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                seclarge = largest;
                largest = arr[i];
            }
            if (arr[i] > seclarge && arr[i] != largest) {
                seclarge = arr[i];
            }
        }
        return seclarge;

    }
}