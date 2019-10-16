package factory;


import java.util.ArrayList;
import java.util.List;

import Customers.BusinessCustomer;
import Customers.CasualCustomer;
import Customers.Customer;
import Customers.RegularCustomer;


public class CustomerFactory {
	static List<Customer> customers = new ArrayList<Customer> (12);
	


	public static Customer getCustomer(String type,String name) {

		if(type.equalsIgnoreCase("RegularCustomer")) return new RegularCustomer(name);
		if(type.equalsIgnoreCase("BusinessCustomer")) return new BusinessCustomer(name);
		if(type.equalsIgnoreCase("CasualCustomer")) return new CasualCustomer(name);
		else
		return null;
		
	}
	
public static Customer getCustomerWithId(int id) {
	
	for(int i=0;i<5;i++) {
		customers.add(new RegularCustomer("R_customer_"+String.valueOf(i)));
	}
	
	for(int i=5;i<9;i++) {
		customers.add(new CasualCustomer("C_customer_"+String.valueOf(i)));
	}
	
	for(int i=9;i<12;i++) {
		customers.add(new BusinessCustomer("B_customer_"+String.valueOf(i)));
	}


		if(id>0 && id<12) {
			return customers.get(id);
		}
		return null;
		
	}
	
}
