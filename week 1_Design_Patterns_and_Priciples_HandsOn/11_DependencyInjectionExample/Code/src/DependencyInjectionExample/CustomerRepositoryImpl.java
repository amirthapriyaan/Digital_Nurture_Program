package DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository{
	 @Override
	    public Customer findCustomerById(String customerId) {
	        // Simulated database lookup
	        return new Customer(customerId, "A", "a@gmail.com");
	    }
}
