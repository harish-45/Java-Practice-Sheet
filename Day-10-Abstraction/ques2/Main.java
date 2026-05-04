public class Main {
    public static void main(String[] args) {

        Payment payment1 = new PaypalPayment(); // creating an object of the PaypalPayment class
        payment1.makePayment(2000); // calling the makePayment method of the PaypalPayment class
        payment1.refundPayment(1000); // calling the refundPayment method of the PaypalPayment class

        Payment payment2 = new CardPayment(); // creating an object of the CardPayment class
        payment2.makePayment(1500); // calling the makePayment method of the CardPayment class
        payment2.refundPayment(750); // calling the refundPayment method of the CardPayment class
    }
}
