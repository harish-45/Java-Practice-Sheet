import java.util.Scanner;

public class DuplicateRemover {
    public static void main(String[] args) {
        String str;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an String : ");
            str = sc.nextLine();
        }

        String res = removeDuplicate(str);
        System.out.println("String after removing duplicats : " + res);
    }

    public static String removeDuplicate(String str) {
        StringBuilder sb = new StringBuilder();

        str = str.replaceAll("\\s+", "").toLowerCase();
        for (int i = 0; i < str.length(); i++)

            if (sb.indexOf(String.valueOf(ch)) == -1)
            if (isUnique(sb, str.charAt(i)))
                sb.append(str.charAt(i));

        return new String(sb);
    }

    public static boolean isUnique(StringBuilder str, char c) {
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == c)
                return false;
        return true;
    }

}
