package ObserverPatternExample;

public class MobileApp implements Observer{
	private String app;

	public MobileApp(String app) {
		super();
		this.app = app;
	}

	@Override
	public void update(String stockName, double newPrice) {
		// TODO Auto-generated method stub
		System.out.println("[" + app + "] Mobile App - " + stockName + " price updated to Rs." + newPrice);
	}
	
}
