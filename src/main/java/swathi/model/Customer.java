package swathi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

import swathi.model.BillingAddress;
import swathi.model.Cart;
import swathi.model.ShippingAddress;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Customer implements Serializable {
	
	private static final long serialVersionUID = 5140900014886997914L;

	private String customerName;
	private String customerEmail;
	private String customerPhone;
	private String username;
	private String password;

	private boolean enabled;

	public Customer() {
		super();
	}

	public Customer(String customerName, String customerEmail, String customerPhone, String username, String password,
			boolean enabled, int customerId) {
		super();
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.customerId = customerId;
	}

	@Id
	@GeneratedValue
	private int customerId;
	public int getCustomerId() {
		return customerId;
	}
	 @OneToOne
	    @JoinColumn(name="billingAddressId")
	    private BillingAddress billingAddress;

	    public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

		@OneToOne
	    @JoinColumn(name="shippingAddressId")
	    private ShippingAddress shippingAddress;

	    @OneToOne
	    @JoinColumn(name = "cartId")
	    @JsonIgnore
	    private Cart cart;

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	
	


	
	

}
