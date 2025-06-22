package ObserverPatternExample;


public class WebApp implements Observer {
 private String site;

 public WebApp(String site) {
	super();
	this.site = site;
 }

 @Override
 public void update(String stockName, double newPrice) {
	// TODO Auto-generated method stub
	 
	  System.out.println("[" + site + "] Web App - " + stockName + " price updated to Rs." + newPrice);
	
 }
 
 
 
 
 

 
}

