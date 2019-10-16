package Customers;

import java.util.List;

import Rental.Record;

public abstract class Customer {

	String name;
	public String getName() {
		return name;
	}
	List<Record> rr;
	String CustomerType;
	public String getCustomerType() {
		return CustomerType;
	}
	
}
