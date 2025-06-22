package ObserverPatternExample;
//ObserverPatternTest.java
public class ObserverPatternTest {
 public static void main(String[] args) {
     // Create the stock market (subject)
     StockMarket stockMarket = new StockMarket("ABC Corp", 120.00);


     Observer mobileObserver = new MobileApp("MarketTracker");
     Observer webObserver = new WebApp("StockWeb");

     
     stockMarket.register(mobileObserver);
     stockMarket.register(webObserver);

    
     stockMarket.setStockPrice(125.50);

    
     stockMarket.setStockPrice(130.00);

   
     stockMarket.deregister(mobileObserver);

    
     stockMarket.setStockPrice(135.75);
 }
}
