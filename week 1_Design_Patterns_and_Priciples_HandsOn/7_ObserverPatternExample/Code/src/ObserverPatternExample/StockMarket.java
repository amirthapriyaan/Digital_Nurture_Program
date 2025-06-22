package ObserverPatternExample;

import java.util.*;

public class StockMarket implements Stock{

	private List<Observer> obs = new ArrayList<>();
	private String stockName;
	private double stockPrice;
	public StockMarket( String stockName, double stockPrice) {
		super();
		
		this.stockName = stockName;
		this.stockPrice = stockPrice;
	}
	@Override
	public void register(Observer ob) {
		// TODO Auto-generated method stub
		obs.add(ob);
	}
	@Override
	public void deregister(Observer ob) {
		// TODO Auto-generated method stub
		obs.remove(ob);
	}
	@Override
	public void notification() {
		// TODO Auto-generated method stub
		for(Observer o:obs) {
			o.update(stockName,stockPrice);
		}
	}
	 public void setStockPrice(double newPrice) {
	        this.stockPrice = newPrice;
	        notification();  // Notify all observers of the change
	    }
	

}
