package factory;


import Customers.BusinessCustomer;
import Customers.CasualCustomer;
import Customers.Customer;
import Customers.RegularCustomer;


public class CustomerFactory {
	static Customer[]customers = new Customer[12];
	
	private CustomerFactory() {
        // To prevent instantiation
		//to create only 12 customers
		for(int i=0;i<5;i++) {
			customers[i] = new RegularCustomer("R_customer_"+String.valueOf(i));
		}
		for(int i=0;i<4;i++) {
			customers[i] = new RegularCustomer("C_customer_"+String.valueOf(i));
		}
		for(int i=0;i<3;i++) {
			customers[i] = new RegularCustomer("B_customer_"+String.valueOf(i));
		}
    }
	

	public static Customer getCustomer(String type,String name) {
		
     	
		if(type.equalsIgnoreCase("RegularCustomer")) return new RegularCustomer(name);
		if(type.equalsIgnoreCase("BusinessCustomer")) return new BusinessCustomer(name);
		if(type.equalsIgnoreCase("CasualCustomer")) return new CasualCustomer(name);
		else
		return null;
		
	}
	
public static Customer getCustomerWithId(int id) {
		
     	
		if(id>0 && id<12) {
			return customers[id];
		}
		return null;
		
	}
	
}
