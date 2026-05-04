public class Main {
    public static void main(String[] args) {
        // creating an object of the class
        // we cannot create an object of an abstract class
        // but we can create a reference variable of an abstract class
        
        // Shape s = new Shape(); // error: cannot instantiate the type Shape

        Shape shape; // reference variable of type Shape

        Circle circle = new Circle(12.5); // creating an object of the Circle class
        shape = circle; // upcasting: assigning a Circle object to a Shape reference variable
        shape.display(); // calling the display method of the Circle class
        System.out.println("Area of the circle: " + circle.area()); // calling the area method of the Circle class

        Rectangle rectangle = new Rectangle(10, 5); // creating an object of the Rectangle class
        shape = rectangle; // upcasting: assigning a Rectangle object to a Shape reference variable
        shape.display(); // calling the display method of the Rectangle class   

        System.out.println("Area of the rectangle: " + rectangle.area()); // calling the area method of the Rectangle class
    }
}
