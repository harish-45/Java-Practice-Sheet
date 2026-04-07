// A.	Create a class Person with the following attributes:
// a.	name (String)
// b.	age (int)
// Provide two constructors:
// a.	A default constructor that initializes name to "Unknown" and age to 0.
// b.	A parameterized constructor that initializes name and age with the values provided.
// In the parameterized constructor, use this to refer to the current instance of the object.


public class Person {
    String name;
    int age;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }
    public Person(String name , int age) {
        this.name = name;
        this.age = age;
    }
        
}
