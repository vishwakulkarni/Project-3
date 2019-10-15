package hardwarerentalstore;

import java.util.Scanner;

import Customers.Customer;
import Rental.RentalRecord;
import decorator.AddOnDecorator;
import factory.CustomerFactory;
import factory.ToolFactory;
import tools.Painting;
import tools.Tool;

public class HardwareRentalStore {

	public static void main(String[] args) {
		
		
		
		System.out.println("Store Opens on Monday");
		System.out.println("---------------------");
		System.out.println("customer walks in : ");
		
		while(true){
			System.out.println("please provide your id : ");
			@SuppressWarnings("resource")
			Scanner keys = new Scanner(System.in);
			int id = keys.nextInt();
			if(id<0 && id >12) {
				break;
			}
			Customer temp = CustomerFactory.getCustomerWithId(id);
			//System.out.println("Welcome customer:",temp.getName());
        }
		
		System.out.println(Painting.count);
		
		
		Tool t = ToolFactory.getTool("Painting","Painting tool 1", 3);
		
		Tool at = ToolFactory.getAddOnTool("ExtensionCord","Extension Cord 1",t);
		Tool at2 = ToolFactory.getAddOnTool("ExtensionCord","Extension Cord 2",at);
		
		System.out.println(at2.getPrice());
		
		RentalRecord rr = new RentalRecord();
		rr.addDocoratedTools((AddOnDecorator) at2);
		rr.addDocoratedTools(t);
		
		
	System.out.println(rr.getTotalPrice());	
	
	System.out.println(Painting.count);
	
	rr.returnRental();

	
	System.out.println(Painting.count);

	}

}
