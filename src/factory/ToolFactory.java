package factory;

import Accessory.AccessoryKit;
import Accessory.ExtensionCord;
import Accessory.ProtectiveGearPack;
import tools.Concrete;
import tools.Painting;
import tools.Plumbing;
import tools.Tool;
import tools.Woodwork;
import tools.Yardwork;

public class ToolFactory {

	public static Tool getTool(String type,String name,int nytNo) {
		
		if(type.equalsIgnoreCase("Concrete")) return Concrete.getInstance(name,nytNo);
		if(type.equalsIgnoreCase("Painting")) return Painting.getInstance(name,nytNo);
		if(type.equalsIgnoreCase("Plumbing")) return Plumbing.getInstance(name,nytNo);
		
		if(type.equalsIgnoreCase("Woodwork")) return Woodwork.getInstance(name,nytNo);
		if(type.equalsIgnoreCase("Yardwork")) return Yardwork.getInstance(name,nytNo);
		
		else 
			
		return null;	
	}
	
	
	public static Tool getAddOnTool(String type,String name,Tool tool) {
	     	
		if(type.equalsIgnoreCase("AccessoryKit")) return new AccessoryKit(tool);
		if(type.equalsIgnoreCase("ExtensionCord")) return new ExtensionCord(tool);
		if(type.equalsIgnoreCase("ProtectiveGearPack")) return new ProtectiveGearPack(tool);
		else
		return null;
		
	}
	

	
}
