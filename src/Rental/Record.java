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

}
