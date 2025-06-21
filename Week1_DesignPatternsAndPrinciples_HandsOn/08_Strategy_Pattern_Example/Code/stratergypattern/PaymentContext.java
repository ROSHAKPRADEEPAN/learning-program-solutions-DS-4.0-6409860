package stratergypattern;


public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void payAmount(double amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment strategy selected.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
