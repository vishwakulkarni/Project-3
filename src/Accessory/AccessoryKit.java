package Accessory;

import decorator.AddOnDecorator;
import tools.Tool;

public class AccessoryKit extends AddOnDecorator{

	static final int price = 18;
	static final String addOnName = "AccessoryKit";
	
	public AccessoryKit(Tool tool) {
		super(tool, price,addOnName);
	}
}
