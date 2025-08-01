package EcommercePlatformSearchFunction;

public class Order {
    private String orderId;
    private String customerName;
    private double totalPrice;

    public Order(String orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order Details:\n"
             + "  ID : " + orderId + "\n"
             + "  Customer : " + customerName + "\n"
             + "  TotalPrice : " + totalPrice + "\n";
    }

}

