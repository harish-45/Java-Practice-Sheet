import java.util.Scanner;

public class StringOperations {

    public static String upperCase(String str) {
        return str.toUpperCase();
    }

    // here every iteration new string object are creating
    // ..so use the mutable string
    // public static String reverseString(String str) {
    //     String ans = "";
    //     for (int i = str.length() - 1; i >= 0; i--) {
    //         ans += str.charAt(i);
    //     }
    //     return ans;
    // }

    // reverse String Using Loop
    public static String reverseStringLoop(String str) {
        // why you use '{ str.length() }' here . bcs we know the after the reverse the length of String is same . and 
        // => If you pass capacity to StringBuilder it works even faster than pasing value .
        StringBuilder sb = new StringBuilder(str.length());
        int i = str.length();
        while (--i >= 0) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // reverse using .reverse() 
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString(); 
    }

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u')
                count++;
        }
        return count;
    }

    public static int countConstant(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z' && charAt != 'a' && charAt != 'e' && charAt != 'i' && charAt != 'o'
                    && charAt != 'u') {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    // using reverse
    public static boolean isPalindromeSB(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = in.nextLine();

        // reverse 
        String ans = reverseString(str);
        System.out.println(ans);

        // to uppercase
        String upperCased = upperCase(str);
        System.out.println(upperCased);

        int numVowel = countVowels(str);
        System.out.println(numVowel);

        int numConstant = countConstant(str);
        System.out.println(numConstant);

        // check is string is Paliondrome
        // String str = "kanak";
        boolean is = isPalindromeSB(str);
        System.out.println(is);

        in.close();
    }
}
