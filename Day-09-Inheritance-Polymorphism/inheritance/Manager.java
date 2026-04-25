package inheritance;

public class Manager extends Employee{
    String department;

    public Manager(String name,double salary,String department) {
        super(name,salary);
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("\n ---- Employee Details ---- \n");
        System.out.println("Name       : " + name);
        System.out.println("Salary     : " + salary);
        System.out.println("Department : "  +department);
    }
}
