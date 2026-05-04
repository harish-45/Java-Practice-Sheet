public class PaypalPayment implements Payment {
    
    public void makePayment(double amount) {
        System.out.println("Payment made using PayPal " + amount);
    }

    public void refundPayment(double amount) {
        System.out.println("Payment refunded to PayPal " + amount);
    }
}
