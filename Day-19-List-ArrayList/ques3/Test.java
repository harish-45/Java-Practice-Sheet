import java.util.ArrayList;

public class Test {
    // ●	Write a Java program that creates an ArrayList of strings, adds several strings to the list, and then uses the contains method to check if a particular string is in the list. Print the result of the check.

    public static void main(String[] args) {
        ArrayList<String> randomStrings = new ArrayList<>();
        randomStrings.add("Apple");
        randomStrings.add("Banana");
        randomStrings.add("Cherry");
        randomStrings.add("Date");
        randomStrings.add("Elderberry");

        boolean contains = randomStrings.contains("Banana");
        System.out.println("Contains 'Banana': " + contains);
    }
}
