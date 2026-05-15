/*
C.	Create a class GenericsDemo with a generic method printArray() that takes an array of any type and prints its elements.
●	Use the method to print an array of Integer, an array of String, and an array of Double.
●	Create a class GenericContainer with a type parameter T and define methods to set and get the value of T.
In the Main class, instantiate GenericContainer with different types (Integer, String, Double) and demonstrate type safety in the generic class.
 */
public class Test {
    public static void main(String[] args) {

        Integer[] nums = { 1, 2, 3, 4, 5, 6, 7 };

        String[] names = { "Alice", "Bob", "Charlie", "David" };

        Double[] prices = { 10.5, 20.0, 30.75, 40.25 };

        GenericsDemo obj = new GenericsDemo();
        obj.printArray(nums);
        obj.printArray(names);
        obj.printArray(prices);


        System.out.println("\n ====== GenericContainer  ====== \n");

        // Integer type
        GenericContainer<Integer> intContainer = new GenericContainer<>();
        intContainer.setValue(100);
        System.out.println("Integer value: " + intContainer.getValue());

        // String type
        GenericContainer<String> stringContainer = new GenericContainer<>();
        stringContainer.setValue("Hello, Generics!");
        System.out.println("String value: " + stringContainer.getValue());

        // Double type
        GenericContainer<Double> doubleContainer = new GenericContainer<>();
        doubleContainer.setValue(3.14);
        System.out.println("Double value: " + doubleContainer.getValue());

        // Type safety demonstration 
        // The following line will cause a compile-time error due to type mismatch
        // intContainer.setValue("This will cause an error"); // Uncommenting this line will cause a compile-time error   
          
    }
}
