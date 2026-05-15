import java.util.ArrayList;

public class Box<T> {
    public ArrayList<T> list;

    public Box() {
        list = new ArrayList<>();
    }

    public void addItem(T value) {
        list.add(value);
    }
}
