package swathi.controller;




import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import swathi.model.Customer;
import swathi.service.CustomerService;

@Controller
public class RegisterController {
	
	@Autowired
	private CustomerService customerService;
	 
	
	@RequestMapping("/register")
	public ModelAndView registerCustomer(Model m) {
			 Customer customer = new Customer();
			 m.addAttribute("customer", customer);
			 ModelAndView model= new ModelAndView("registerCustomer");
		        return model;
		        }
	
	 @RequestMapping(value = "/register1", method = RequestMethod.POST)
	    public String registerCustomerPost(@Valid @ModelAttribute("customer") Customer customer, BindingResult result,
	                                       Model model) {

	        if (result.hasErrors()) {
	            return "registerCustomer";
	        }

	        List<Customer> customerList=customerService.getAllCustomers();
	        {

	        for (int i=0; i< customerList.size(); i++) {
	            if(customer.getCustomerEmail().equals(customerList.get(i).getCustomerEmail())) {
	                model.addAttribute("emailMsg", "Email already exists");

	                return "registerCustomer";
	            }

	            if(customer.getUsername().equals(customerList.get(i).getUsername())) {
	                model.addAttribute("usernameMsg", "Username already exists");

	                return "registerCustomer";
	            }
	        }

	        customer.setEnabled(true);
	        customerService.addCustomer(customer);

	        return "registerCustomerSuccess";

	    }

	}

 
	 }
	
	
	

