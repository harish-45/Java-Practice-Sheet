import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");
        vector.add("Elderberry");
    
        System.out.println("Vector : " + vector);

        // Accessing elements using index
        System.out.println("Element at index 2 : " + vector.get(2));

        // Removing an element
        vector.remove("Date");
        System.out.println("Vector after removing 'Date' : " + vector);

        // Set an element at a specific index
        vector.set(1, "Blueberry");
        System.out.println("Vector after setting index 1 to 'Blueberry' : " + vector);

}    
}
