import java.util.ArrayList;
import java.util.List;

public class WrapperExample {
    public static void main(String[] args) {

        // Autoboxing: Converting int primitive to object
        int a = 10;
        Integer b = a; // Autoboxing    
        System.out.println("Autoboxing: " + b);

        // Unboxing: Converting Integer object back to int primitive
        Integer c = 20;
        int d = c; // Unboxing
        System.out.println("Unboxing: " + d);

        // Using wrapper classes in collections
        List<Integer> intList = new ArrayList<>();
        intList.add(30); // Autoboxing
        intList.add(40);
        intList.add(50);
        System.out.println("Integer List: " + intList);

        // Perform some arithmetic operations on Integer objects and print the results.
        Integer e = 100;
        Integer f = 200;
        Integer g = e + f; // Autoboxing and unboxing bcs it performs .intValue() on e and f, then adds them and autoboxes the result back to Integer
        System.out.println("Sum: " + g);
    }
}
