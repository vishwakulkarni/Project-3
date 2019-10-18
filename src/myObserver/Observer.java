package myObserver;

import java.util.List;

import Rental.Record;
import tools.Inventory;

interface Observer {
	public void update(int day,int []daysEarning,List <Record> completedOrders,List <Record> activeOrder,Inventory inventory );
}
