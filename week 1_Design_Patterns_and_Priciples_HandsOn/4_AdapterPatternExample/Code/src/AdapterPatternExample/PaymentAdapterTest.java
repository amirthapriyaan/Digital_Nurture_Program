package AdapterPatternExample;

//PaymentAdapterTest.java
public class PaymentAdapterTest {
 public static void main(String[] args) {
     // Use PayPal
     PayPalGateway payPal = new PayPalGateway();
     PaymentProcessor paypalProcessor = new PayPalAdapter(payPal);
     paypalProcessor.processPayment(250.00);

     // Use Stripe
     StripeGateway stripe = new StripeGateway();
     PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
     stripeProcessor.processPayment(175.75);
 }
}

