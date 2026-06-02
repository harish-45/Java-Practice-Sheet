import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1, str2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first String : ");
            str1 = sc.next();
            System.out.print("Enter Second String : ");
            str2 = sc.next();
        }

        boolean res = isAnagram(str1, str2);
        System.out.printf("\n%s & %s Are Anagram : %b", str1, str2, res);
    }

    public static boolean isAnagram(String str1, String str2) {
        
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length())
            return false;

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
