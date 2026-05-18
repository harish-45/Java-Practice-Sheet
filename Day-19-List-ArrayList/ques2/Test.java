import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("orange");
        colors.add("pink");
        colors.add("yellow");
        colors.add("voilate");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a colour : ");
            String colour = sc.next();

            if (colors.contains(colour))
                System.out.printf("The color '%s' Exist in list of colors at index '%d'", colour,
                        colors.indexOf(colour));
            else
                System.out.printf("The color '%s' is not in the list" ,colour);

        }

    }
}
