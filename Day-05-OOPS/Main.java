public class Main {
    public static void main(String[] args) {

        // Book 
        Book java = new Book();
        java.title = "Java Basics";
        java.author = "James";
        java.isbn = 123456789;
        java.price = 1000;
        java.publisher = "XYZ";

        java.bookDetails();
        java.applyDiscount(20);

        
        System.out.println("\n");


        // BankAccount 
        BankAccount sbi = new BankAccount();
        sbi.checkBalance();
        sbi.deposit(1000);
        sbi.withdrow(10000);


        // Vehicles.
        Car car = new Car(120);
        Bike bike = new Bike(80);

        System.out.print("Car ");
        car.displaySpeed();
        
        System.out.print("Bike ");
        bike.displaySpeed();


    }
}
