package StrategyPattern;

public class PayPalPayment implements PaymentStrategy{
	private String email;



public PayPalPayment(String email) {
	super();
	this.email = email;
}
	@Override
	public void pay(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Paypal payment using "+email+" : "+amt);
	}
	
}
