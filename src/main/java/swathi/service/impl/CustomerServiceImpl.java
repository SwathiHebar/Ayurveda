package swathi.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import swathi.dao.CustomerDao;

import swathi.model.Customer;
import swathi.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {



@Autowired
  private CustomerDao customerDao;
// void setCustomerDao(CustomerDao u)
//{
	//this.customerDao=u;
//}
public void addCustomer(Customer customer) {
	 customerDao.addCustomer(customer);
	// TODO Auto-generated method stub
		
}

public Customer getCustomerById(int customerId) {
    return customerDao.getCustomerById(customerId);
}

public List<Customer> getAllCustomers() {
    return customerDao.getAllCustomers();
}

public Customer getCustomerByUsername (String username) {
    return customerDao.getCustomerByUsername(username);
}

}
	
