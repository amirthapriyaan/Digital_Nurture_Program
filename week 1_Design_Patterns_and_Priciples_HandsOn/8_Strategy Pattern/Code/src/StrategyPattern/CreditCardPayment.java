package StrategyPattern;

public class CreditCardPayment implements PaymentStrategy{
	
	private String CardNo;

	public CreditCardPayment(String cardNo) {
		super();
		this.CardNo = cardNo;
	}

	@Override
	public void pay(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Card payment using "+CardNo+" : "+amt);
	}
	
	
}
