package hardwarerentalstore;

import java.util.ArrayList;
import java.util.List;

import Accessory.AccessoryKit;
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

public class hardwarerentalstore1 {

	public static void main(String[] args) {
		List<Painting> paintings = new ArrayList<Painting> (5);
		List<Plumbing>  plubings= new ArrayList<Plumbing> (5);
		List<Concrete>  concretes= new ArrayList<Concrete> (5);
		List<Woodwork>  Woodworks= new ArrayList<Woodwork> (5);
		List<Yardwork>  yardworks= new ArrayList<Yardwork> (5);
		List<Tool> toolList = new ArrayList<Tool>();
		
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
		
		System.out.println("Store Opens on Day "+ String.valueOf(details.getDay()));
		System.out.println("---------------------");
		
		//customer comes in
		Customer temp = CustomerFactory.getCustomerWithId(6);
		//tool chosen
		Painting tool_day1 = paintings.get(0);
		details.getInventory().updateInventory(tool_day1,"delete");
		Painting tool_day2 = paintings.get(3);
		details.getInventory().updateInventory(tool_day2,"delete");
		Tool tool_day1_option = new AccessoryKit(tool_day1);
		// System.out.println(tool_day1.getPrice());
		toolList = new ArrayList<Tool>();
		toolList.add(tool_day1_option);
		toolList.add(tool_day2);
		
		Record rec_d1_1 = new Record(temp,toolList,2,2);  // Need to change record with list of tools
		details.updateActiveRecords(rec_d1_1);
		details.updateDaysEarning(tool_day1_option.getPrice());
		System.out.println("Store Opens on Day 2 ");
		System.out.println("---------------------");
		// Day 2 starts
		details.dayChanged();
		details.dayChanged();
		details.dayChanged();
		details.dayChanged();
		System.out.println("---------------------");

	}

}
