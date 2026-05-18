import java.util.LinkedList;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        // Linkedlist is made using DoublyLinkedList Data Structure
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        ListIterator<Integer> forwordItr = list.listIterator();
        System.out.println("List in forword Direction : ");
        while (forwordItr.hasNext()) {
            System.out.print(forwordItr.next() + "-> ");
        }
        System.out.print("null\n");

        // Start iterator from End
        ListIterator<Integer> backwordItr = list.listIterator(list.size());
        System.out.println("List from backword Direction : ");
        while (backwordItr.hasPrevious()) {
            System.out.print(backwordItr.previous() + "-> ");
        }
        System.out.print("null\n");
    }
}
