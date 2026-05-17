public class Main {
    public static void main(String[] args) {
        
        try{
            Bank bank = new Bank();
            bank.processPayment(1000);
            bank.processPayment(-1000);
        } catch (NegativeAmountException e) {
            System.out.println(e);
        }
    }
}
