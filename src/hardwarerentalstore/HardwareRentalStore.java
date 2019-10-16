package hardwarerentalstore;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

import Accessory.AccessoryKit;
import Accessory.ExtensionCord;
import Accessory.ProtectiveGearPack;
import Customers.Customer;
import Rental.RentalRecord;
import decorator.AddOnDecorator;
import factory.CustomerFactory;
import factory.ToolFactory;
import myObserver.DisplayObserver;
import myObserver.StoreDetails;
import tools.Painting;
import tools.Tool;

public class HardwareRentalStore {

	public static void main(String[] args) {
		
		
		
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
