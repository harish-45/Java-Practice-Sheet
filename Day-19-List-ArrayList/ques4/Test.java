import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter a number : ");
            Integer n = sc.nextInt();

            System.out.println("List Before : " + list);
            removeElements(list, n);

            System.out.println("List After : " + list);
        }

    }

    public static void removeElements(ArrayList<Integer> list, Integer n) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % n == 0)
                list.remove(i);
        }
    }
}
