package myObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Rental.Record;

public class DisplayObserver implements Observer {
	
	int day;
	int daysEarning;
	List <Record> completedOrders = new ArrayList<Record>();
	List <Record> activeOrder = new ArrayList<Record>();
	HashMap <String,Integer> toolsRemaining = new HashMap<String, Integer>();

	public DisplayObserver() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(int day, int daysEarning, List<Record> completedOrders, List<Record> activeOrder,
			HashMap<String, Integer> toolsRemaining) {
		this.day = day;
		this.daysEarning = daysEarning;
		this.completedOrders = completedOrders;
		this.activeOrder = activeOrder;
		this.toolsRemaining = toolsRemaining;
		System.out.println("updating from displayOvserver");
		
	}
	
	public void display() {
		//update this display function
		System.out.println(day+" "+daysEarning);
	}

}
