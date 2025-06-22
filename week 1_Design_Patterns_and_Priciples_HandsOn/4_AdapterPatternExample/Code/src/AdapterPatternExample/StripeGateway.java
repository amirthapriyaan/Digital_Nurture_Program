package AdapterPatternExample;

public class StripeGateway {
    public void makePayment(int amountInCents) {
        System.out.println("Stripe processed: $" + (amountInCents / 100.0));
    }
}