public class Bank {
    public void processPayment(double ammount) throws NegativeAmountException {
        if (ammount < 0) {
            throw new NegativeAmountException("Amount is negative!");
        }
    }
}
