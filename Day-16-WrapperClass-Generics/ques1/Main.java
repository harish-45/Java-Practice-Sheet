/*
A.	Create a class Box with a generic type parameter T.
Define methods to set and get the value of type T.
Create two subclasses IntegerBox and StringBox that extend Box.
●	IntegerBox should store and return an Integer value.
●	StringBox should store and return a String value.
In the Main class, create objects of both IntegerBox and StringBox and demonstrate how to store and retrieve values from them.
 */

public class Main {
    
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.setValue(42);
        System.out.println("Integer value in IntegerBox: " + integerBox.getValue());

        StringBox stringBox = new StringBox();
        stringBox.setValue("Hello, World!");
        System.out.println("String value in StringBox: " + stringBox.getValue());
    }
    
}
