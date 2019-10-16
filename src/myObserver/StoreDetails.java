package myObserver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Rental.Record;
import tools.Inventory;
import tools.Tool;

public class StoreDetails implements Subject {
	
	int day;
	int daysEarning;
	List <Record> completedOrders = new ArrayList<Record>();
	List <Record> activeOrder = new ArrayList<Record>();
	Inventory inventory;
	
	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	ArrayList<Observer> observerList;

	public StoreDetails(Inventory inventory) {
		observerList = new ArrayList<Observer>();
		this.inventory = inventory;
		day = 1;
		daysEarning = 0;
		
	}
  
	@Override
    public void registerObserver(Observer o) { 
        observerList.add(o); 
    } 
  
	@Override
    public void unregisterObserver(Observer o) { 
        observerList.remove(observerList.indexOf(o)); 
    } 
  
    @Override
    public void notifyObservers() 
    { 
        for (Iterator<Observer> it = observerList.iterator(); it.hasNext();) 
        { 
            Observer o = it.next(); 
            o.update(day,daysEarning,completedOrders,activeOrder,inventory); 
        } 
    }
    
    public void updateTools(Inventory inventory) {
    	System.out.println("updating tools");
    	this.inventory = inventory;
    }
    
    public void updateActiveRecords(Record newrechord) {
    	activeOrder.add(newrechord);
    }
    
    public int getDay() {
    	return day;
    }
    
    public void setDay(int day) {
    	this.day = day;
    }
    
    public void dayChanged() {
    	day = day + 1;
    	//save days earning in an hashmap
    	for(int i=0;i<activeOrder.size();i++) {
    		activeOrder.get(i).daysRemaining = activeOrder.get(i).daysRemaining - 1;
    		if(activeOrder.get(i).daysRemaining == 0) {
    			Tool myTool = activeOrder.get(i).tool;
    			inventory.updateInventory(myTool, "add");
    			completedOrders.add(activeOrder.get(i));
    			activeOrder.remove(i);
    		}
		}
    	daysEarning = 0;
    	//active orders parse
    	// completed order parse
    	notifyObservers();
    	
    }
    
    public void updateDaysEarning(int earning)
    {
    	this.daysEarning = earning;
    }
    
    public Inventory checkExpiredOrder(Inventory toolsInventory)
    {
    	if(activeOrder.size()==0) {
    		return toolsInventory;
    	}
    	for(int i=0;i<activeOrder.size();i++) {
    		activeOrder.get(i).daysRemaining = activeOrder.get(i).daysRemaining - 1;
    		if(activeOrder.get(i).daysRemaining == 0) {
    			completedOrders.add(activeOrder.get(i));
    			activeOrder.remove(i);
    		}
		}
    	return toolsInventory;
    }
}
