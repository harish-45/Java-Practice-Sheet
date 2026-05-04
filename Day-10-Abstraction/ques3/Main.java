
public class Main {
    public static void main(String[] args) {
        Appliance washingMachine = new WashingMachine(); // creating an object of the WashingMachine class
        washingMachine.turnOn(); 
        washingMachine.showBrand(); 

        Appliance refrigerator = new Refrigerator(); // creating an object of the Refrigerator class
        refrigerator.turnOn(); // calling the turnOn method of the Refrigerator class
        refrigerator.showBrand(); // calling the showBrand method of the Appliance class
    }
}
