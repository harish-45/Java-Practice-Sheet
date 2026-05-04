public interface Payment {

    void makePayment(double amount);
    void refundPayment(double amount);
}