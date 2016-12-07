package swathi.service;

import java.util.List;

import swathi.model.Customer;

import swathi.model.*;;



public interface CustomerService {

    void addCustomer(Customer customer);
    Customer getCustomerById (int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername (String username);


    
}
