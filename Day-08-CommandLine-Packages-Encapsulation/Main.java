import shapes.Circle;
public class Main {
    public static void main(String[] args) {
        System.out.println("\n ---- Circle Details ---- ");
        Circle obj = new Circle(5.0);
        System.out.printf("The Area of Circle is : %.5f", obj.calculateArea());
       
        System.out.println("\n");

        System.out.println("\n ---- Account Details ---- ");
        SavingsAccount sbi = new SavingsAccount(765463656, 1000);
        sbi.displayAccountInfo();
    
    }
}
