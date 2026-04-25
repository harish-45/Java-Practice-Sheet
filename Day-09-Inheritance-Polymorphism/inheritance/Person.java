package inheritance;

// B.	Create a class `Person` with the following attributes:
// - name (String)
// - age (int)
// Provide two constructors:
//   - A default constructor that sets `name` to "Unknown" and `age` to 0.
//   - A parameterized constructor that initializes `name` and `age` with the provided values.
// Create a subclass `Student` that extends `Person` and adds an additional attribute `studentId` (int).
// Provide a constructor in `Student` that initializes `studentId` and calls the `Person` constructor using `super()`.
// In the `Main` class, create an object of `Student` and display the details (name, age, studentId).


public class Person {
    String name;
    int age;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
