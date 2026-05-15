public class Main {
    public static void main(String[] args) {
        IntegerBox intBox = new IntegerBox();
        intBox.addItem(10);
        intBox.addItem(20);
        intBox.addItem(30);
        intBox.addItem(40);
        intBox.addItem(50);
        
        
        StringBox strBox = new StringBox();
        strBox.addItem("Hello");
        strBox.addItem("World");
        strBox.addItem("Java");
        strBox.addItem("Generics");
        strBox.addItem("Box");

        System.out.println("Integer Box Items: " + intBox.list);
        System.out.println("String Box Items: " + strBox.list);

    }
}

