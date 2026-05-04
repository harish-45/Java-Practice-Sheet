public class CardPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment made using Credit Card " + amount);
    }

    public void refundPayment(double amount) {
        System.out.println("Payment refunded to Credit Card " + amount);
    }
    
}
