import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Ayush");
        list.add("Ishant");
        list.add("Gaurav");
        list.add("Akshay");
        list.add("Armaan");
        
        System.out.println("list : " + list);

        list.remove(1);
        
        System.out.println("list after 2nd ele is removed : " + list);
    }
}
