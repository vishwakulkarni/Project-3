package Customers;

import java.util.List;

import Rental.RentalRecord;

public abstract class Customer {

	String name;
	public String getName() {
		return name;
	}
	List<RentalRecord> rr;
	String CustomerType;
	public String getCustomerType() {
		return CustomerType;
	}
	
}
