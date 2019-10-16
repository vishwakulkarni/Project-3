package hardwarerentalstore;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

import Accessory.AccessoryKit;
import Accessory.ExtensionCord;
import Accessory.ProtectiveGearPack;
import Customers.Customer;
import Rental.Record;
import factory.CustomerFactory;
import factory.ToolFactory;
import myObserver.DisplayObserver;
import myObserver.StoreDetails;
import tools.Concrete;
import tools.Inventory;
import tools.Painting;
import tools.Plumbing;
import tools.Tool;
import tools.Woodwork;
import tools.Yardwork;

public class HardwareRentalStore {

	public static void main(String[] args) {
		
		List<Painting> paintings = new ArrayList<Painting> (5);
		List<Plumbing>  plubings= new ArrayList<Plumbing> (5);
		List<Concrete>  concretes= new ArrayList<Concrete> (5);
		List<Woodwork>  Woodworks= new ArrayList<Woodwork> (5);
		List<Yardwork>  yardworks= new ArrayList<Yardwork> (5);
		
		//creating inventory
		for(int i =0;i<5;i++) {
			paintings.add((Painting)ToolFactory.getTool("Painting", "Painting tool "+String.valueOf(i), 1));
			Woodworks.add((Woodwork)ToolFactory.getTool("Woodwork", "Woodwork tool "+String.valueOf(i), 1));
			plubings.add((Plumbing)ToolFactory.getTool("Plumbing", "Plumbing tool "+String.valueOf(i), 1));
			concretes.add((Concrete)ToolFactory.getTool("Concrete", "Concrete tool "+String.valueOf(i), 1));
		}
		for (int i=0;i<4;i++) {
			yardworks.add((Yardwork)ToolFactory.getTool("Yardwork", "Yardwork tool "+String.valueOf(i), 1));
		}
		
		Inventory toolsInventory = new Inventory(paintings,plubings,concretes,Woodworks,yardworks);
		 
		//display Observer and registering it
		DisplayObserver displayStoreDetails = new DisplayObserver();
		StoreDetails details = new StoreDetails(toolsInventory);
		details.registerObserver(displayStoreDetails);
		/*
		while(true){
			System.out.println("Store Opens on Day"+String.valueOf(details.getDay()));
			System.out.println("---------------------");
			System.out.println("customer walks in : ");
			displayStoreDetails.display();
			System.out.println("please provide your id : ");
			@SuppressWarnings("resource")
			int id = in.nextInt();
			String removeThis = in.nextLine();
			if(id<0 && id >12) {
				break;
			}
			Customer temp = CustomerFactory.getCustomerWithId(id);
			System.out.println("Welcome customer:"+temp.getName()+" Your are a "+temp.getCustomerType());
			System.out.println("Please enter the tools you would like to buy:");
			String cTools = in.nextLine();
			Tool myTool = ToolFactory.getTool(cTools,cTools+" tool 1", 1);
			System.out.println("Do you want to add any add ons:");
			String cAddOns = in.nextLine();
			if(cAddOns=="AccessoryKit") {
				myTool = new AccessoryKit(myTool,cAddOns);
			}
			if(cAddOns=="ExtensionCord") {
				myTool = new ExtensionCord(myTool,cAddOns);
			}
			if(cAddOns=="ProtectiveGearPack") {
				myTool = new ProtectiveGearPack(myTool,cAddOns);
			}
			System.out.println("How many Days do you want to take it:");
			int days = in.nextInt();
			System.out.println("please pay this much amount :"+days*myTool.getPrice());
			Record newRecord = new Record(temp, myTool, days, days);
			details.updateActiveRecords(newRecord);
			System.out.println("Are there more customers? 1 for y 2 for n");
			int temp1 = in.nextInt();
			if(temp1 == 1) {
				continue;
			}
			else {
				System.out.println("day is completed");
				System.out.println("now lets begin next day");
				details.dayChanged();
				
			}
				
			
        }
		*/
		System.out.println("Store Opens on Day "+ String.valueOf(details.getDay()));
		System.out.println("---------------------");
		
		//customer comes in
		Customer temp = CustomerFactory.getCustomerWithId(6);
		//tool chosen
		Painting tool_day1 = paintings.get(0);
		//add on choosen
		details.getInventory().updateInventory(tool_day1,"delete");
		Tool tool_day1_option = new AccessoryKit(tool_day1); // update price of each day with tool_day1_option.getPrice();
		
		// System.out.println(tool_day1.getPrice());
		
		Record rec_d1_1 = new Record(temp,tool_day1,2,2);  // Need to change record with list of tools
		details.updateActiveRecords(rec_d1_1);
		details.updateDaysEarning(tool_day1_option.getPrice());
		// toolsInventory.updatePaintInventory(tool_day1,"add");
		System.out.println("Store Opens on Day 2 ");
		
		// Day 2 starts
		details.dayChanged();
		
		// Check for order expire today in Active orders
		toolsInventory = details.checkExpiredOrder(toolsInventory);
		
		// Add new customer in Active orders and update inventory
		temp = CustomerFactory.getCustomerWithId(2);
		Tool tool_day2 = concretes.get(0);
		// toolsInventory.updateInventory(tool_day2,"delete");
		// Add option
		Tool tool_day2_option = new ExtensionCord(tool_day2); 
		
		// Add into active record
		Record rec_d2_1 = new Record(temp,tool_day2,3,3);
		details.updateActiveRecords(rec_d2_1);
		details.updateDaysEarning(tool_day2_option.getPrice());
		
		
		
		// Day 3 Starts
		
		details.dayChanged();
		
		// Check for order expire today in Active orders
		toolsInventory = details.checkExpiredOrder(toolsInventory);
		
		// Add new customer in Active orders and update inventory
		temp = CustomerFactory.getCustomerWithId(3);
		Tool tool_day3 = concretes.get(3);
		//toolsInventory.updateInventory(tool_day2,"delete");
		// Add option
		Tool tool_day3_option = new ExtensionCord(tool_day2); 
		
		// Add into active record
		Record rec_d3_1 = new Record(temp,tool_day3,2,2);
		details.updateActiveRecords(rec_d3_1);
		details.updateDaysEarning(tool_day2_option.getPrice());
		
		
		
		

	}

}
