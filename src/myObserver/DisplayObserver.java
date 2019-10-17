package myObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Rental.Record;
import tools.Inventory;

public class DisplayObserver implements Observer {
	
	int day;
	int daysEarning;
	List <Record> completedOrders = new ArrayList<Record>();
	List <Record> activeOrder = new ArrayList<Record>();
	Inventory inventory;

	public DisplayObserver() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(int day, int daysEarning, List<Record> completedOrders, List<Record> activeOrder,
			Inventory inventory) {
		this.day = day;
		this.daysEarning = daysEarning;
		this.completedOrders = completedOrders;
		this.activeOrder = activeOrder;
		this.inventory = inventory;
		System.out.println("updating from displayOvserver");
		
	}
	
	public void display() {
		//update this display function
		System.out.println("Day "+String.valueOf(day));
		System.out.println("Days Earning " + String.valueOf(day) );
		System.out.println("Completed Orders are:");
		for(int i=0;i<completedOrders.size();i++) {
			completedOrders.get(i).print();
		}
		for(int i=0;i<completedOrders.size();i++) {
			activeOrder.get(i).print();
		}
		System.out.println(day+" "+daysEarning);
	}

}
