public class Refrigerator extends Appliance {

    @Override
    public void turnOn() {
        System.out.println("Refrigerator is now ON.");
    }

    @Override
    public void showBrand() {
        System.out.println("This is a refrigerator of Brand Samsung.");
    }

}