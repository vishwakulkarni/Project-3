package Rental;

import Customers.Customer;
import tools.Tool;

public class Record {
	public Customer customer;
	public Tool tool;
	public int daysTaken;
	public int daysRemaining;

	public Record(Customer customer,Tool tool, int daysTaken, int daysRemaining) {
		this.customer = customer;
		this.tool = tool;
		this.daysTaken = daysTaken;
		this.daysRemaining = daysRemaining;
	}
	
	public void print() {
		System.out.println("Customer name "+this.customer.getName());
		System.out.println("Tool taken "+this.tool.getName());
		System.out.println("AddOn taken "+this.tool.getAddOn());
		System.out.println("Days take "+String.valueOf(daysTaken));
		System.out.println("Days remaining "+String.valueOf(daysTaken));
	}
}
