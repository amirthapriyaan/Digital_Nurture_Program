package AdapterPatternExample;

public class PayPalGateway {
    public void sendMoney(double amountInDollars) {
        System.out.println("PayPal processed: $" + amountInDollars);
    }
}