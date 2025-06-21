package stratergypattern;

public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "Roshak"));
        context.payAmount(1500.0);

        context.setPaymentStrategy(new PayPalPayment("roshak@example.com"));
        context.payAmount(999.0);
    }
}
