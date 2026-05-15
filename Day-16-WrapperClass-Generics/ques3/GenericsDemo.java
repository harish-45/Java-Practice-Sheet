
public class GenericsDemo {
    public <T> void printArray(T[] arr) {
        System.out.print("Array elements:  ");
        for (T element : arr) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }
}
