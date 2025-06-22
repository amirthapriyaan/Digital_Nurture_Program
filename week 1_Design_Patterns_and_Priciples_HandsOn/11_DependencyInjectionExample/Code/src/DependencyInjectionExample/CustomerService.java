package DependencyInjectionExample;


public class CustomerService {
 private final CustomerRepository customerRepository;


 public CustomerService(CustomerRepository customerRepository) {
     this.customerRepository = customerRepository;
 }

 public void displayCustomerDetails(String customerId) {
     Customer customer = customerRepository.findCustomerById(customerId);
     if (customer != null) {
         System.out.println("Customer ID   : " + customer.getId());
         System.out.println("Customer Name : " + customer.getName());
         System.out.println("Customer Email: " + customer.getEmail());
     } else {
         System.out.println("Customer not found.");
     }
 }
}

