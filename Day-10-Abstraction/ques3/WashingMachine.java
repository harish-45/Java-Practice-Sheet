public class WashingMachine extends Appliance {

    @Override
    public void turnOn() {
        System.out.println("Washing Machine is now ON.");
    }

    @Override
    public void showBrand() {
        System.out.println("This is a washing machine of Brand LG.");
    }
    
}
