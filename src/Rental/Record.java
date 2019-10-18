package Rental;

import java.util.ArrayList;
import java.util.List;

import Customers.Customer;
import tools.Tool;

public class Record {
	public Customer customer;
	public List<Tool> tool = new ArrayList<Tool>();
	public int daysTaken;
	public int daysRemaining;

	public Record(Customer customer,List<Tool> tool, int daysTaken, int daysRemaining) {
		this.customer = customer;
		this.tool = tool;
		this.daysTaken = daysTaken;
		this.daysRemaining = daysRemaining;
	}
	
	public void print() {
		System.out.println("Customer name "+this.customer.getName());
		System.out.println("Tools taken "+String.valueOf(tool.size()));
		for(int i=0;i<tool.size();i++) {
			System.out.println("Tool Name: "+this.tool.get(i).getName());
			System.out.println("AddOn Name: "+this.tool.get(i).getAddOn());
		}
		System.out.println("Days take "+String.valueOf(daysTaken));
		System.out.println("Days remaining "+String.valueOf(daysTaken));
	}
}
