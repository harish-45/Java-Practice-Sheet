package polymorphism;

// C.	Create a class `Calculator` with two overloaded methods for multiplying numbers:    
//   - `multiply(int a, int b)` that returns the product of two integers.
//   - `multiply(double a, double b)` that returns the product of two doubles.
// Overload the `multiply` method to handle both integer and double arguments.
// In the `Main` class, create an object of `Calculator` and demonstrate both overloaded methods by multiplying integers and doubles.

public class Calculator {

    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double multiply(double a, double b) {
        return  a * b ;
    }
}
