import inheritance.*;
import polymorphism.Calculator;
import polymorphism.Rectangle;
import polymorphism.Shape;

public class Main {
    public static void main(String[] args) {

        // Employee && Inheritance concept
        Manager obj = new Manager("Harry", 1200000.0, "Development");
        obj.displayDetails();


        // Person
        Student shushil = new Student("shushil", 20, 45334);
        shushil.displayDetails();


        System.out.println("\n----- Calculator 'Polymorphism Using OverLoading' -----\n");

        // Calculator && 'Compile-time' Polymorphism Concept
        Calculator calc = new Calculator();
        int ans1 = calc.multiply(10, 20);
        double ans2 = calc.multiply(10.5, 10.5);

        System.out.println("Using int multiply     : " + ans1);
        System.out.println("Using double multiply  : " + ans2);


        System.out.println("\n----- Shape 'Polymorphism Using Overriding' -----\n");

        // Shapes Run time Polymorphism 
        Shape circle = new Shape();
        Shape rectangle = new Rectangle();

        circle.drow();
        rectangle.drow();

        System.out.println("\nEnd...");

    }
}
