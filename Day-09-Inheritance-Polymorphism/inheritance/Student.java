package inheritance;

public class Student extends Person{
    int studentId;
    
    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

     public void displayDetails() {
        System.out.println("\n ---- Student Details ---- \n");
        System.out.println("Name      : " + name);
        System.out.println("age       : " + age);
        System.out.println("studentId : "  +studentId);
    }
}
