package myObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import Rental.Record;

public class StoreDetails implements Subject {
	
	int day;
	int daysEarning;
	List <Record> completedOrders = new ArrayList<Record>();
	List <Record> activeOrder = new ArrayList<Record>();
	HashMap <String,Integer> toolsRemaining = new HashMap<String, Integer>();
	
	ArrayList<Observer> observerList;

	public StoreDetails() {
		// TODO Auto-generated constructor stub
		observerList = new ArrayList<Observer>();
		toolsRemaining.put("Concrete", 5);
		toolsRemaining.put("Painting", 5);
		toolsRemaining.put("Plumbing", 5);
		toolsRemaining.put("Woodwork", 5);
		toolsRemaining.put("Yardwork", 4);
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
        for (Iterator<Observer> it = 
              observerList.iterator(); it.hasNext();) 
        { 
            Observer o = it.next(); 
            o.update(day,daysEarning,completedOrders,activeOrder,toolsRemaining); 
        } 
    }
    
    public void updateTools(String toolType) {
    	System.out.println("updating tools");
    	
    	toolsRemaining.put(toolType, toolsRemaining.get(toolType) - 1);
    }
    
    public void dayChanged() {
    	day = day + 1;
    	//save days earning in an hashmap
    	daysEarning = 0;
    	//active orders parse
    	// completed order parse
    	notifyObservers();
    	
    }
}
