package inheritance;

// A.	Create a superclass Employee with the following attributes:
// - name (String)
// - salary (double)
// Add a constructor in the Employee class to initialize name and salary.
// Create a subclass Manager that extends Employee and adds an additional attribute department (String).
// Add a constructor in the Manager class to initialize ‘department’ and call the superclass constructor using super().
// In the Main class, create an object of Manager and display its details (name, salary, department).


public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

}
