import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        // ArrayList is made using Dynamic Array Data Structure
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }

        // Assume largest and smallest 
        int largest = list.get(0);
        int smallest = list.get(0);

        for (int i = 0; i < 10; i++) {
            int val = list.get(i);
            if (val > largest)
                largest = val;
            if (val < smallest)
                smallest = val;
        }
        
        System.out.println(list);

        System.out.println("\nThe Largest Number in Arraylist  : " +  largest);
        System.out.println("The Smallest Number in Arraylist : " + smallest);   
    }

}
