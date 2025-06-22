package EcommercePlatformSearchFunction;

public class Testing {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O1", "Alice", 1200.0),
            new Order("O2", "Bob", 700.5),
            new Order("O3", "Charlie", 3500.0),
            new Order("O4", "Daisy", 950.0)
        };

      
        System.out.println("Using Bubble Sort:");
        SortAlgorithms.bubbleSort(orders);
        for (Order o : orders) {
            System.out.println(o);
        }

        
        Order[] orders2 = {
            new Order("O1", "A", 1200.0),
            new Order("O2", "B", 700.5),
            new Order("O3", "C", 3500.0),
            new Order("O4", "D", 950.0)
        };

        
        System.out.println("\nUsing Quick Sort:");
        SortAlgorithms.quickSort(orders2, 0, orders2.length - 1);
        for (Order o : orders2) {
            System.out.println(o);
        }
    }
}

