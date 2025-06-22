package AdapterPatternExample;

//StripeAdapter.java
public class StripeAdapter implements PaymentProcessor {

 private StripeGateway stripe;

 public StripeAdapter(StripeGateway stripe) {
     this.stripe = stripe;
 }

 @Override
 public void processPayment(double amount) {
     int amountInCents = (int)(amount * 100);
     stripe.makePayment(amountInCents);
 }
}
