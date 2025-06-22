package StrategyPattern;

public class StrategyPatternTest {
 public static void main(String[] args) {
     PaymentContext context = new PaymentContext();

   
     PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456");
     context.setPaymentStrategy(creditCard);
     context.makePayment(150.00);

    
     PaymentStrategy paypal = new PayPalPayment("user@example.com");
     context.setPaymentStrategy(paypal);
     context.makePayment(75.50);
 }
}
