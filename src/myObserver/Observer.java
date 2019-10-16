package myObserver;

import java.util.HashMap;
import java.util.List;

import Rental.Record;

interface Observer {
	public void update(int day,int daysEarning,List <Record> completedOrders,List <Record> activeOrder,HashMap <String,Integer> toolsRemaining);
}
