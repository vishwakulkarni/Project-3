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
		
		System.out.println("Store Opens on Day 1");
		System.out.println("---------------------");
		System.out.println("customer walks in : ");
		Dictionary cashMade = new Hashtable(); 
		//display Observer and registering it
		DisplayObserver displayStoreDetails = new DisplayObserver();
		StoreDetails details = new StoreDetails();
		details.registerObserver(displayStoreDetails);
		Scanner in = new Scanner(System.in);
		while(true){
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

	}

}
