package Accessory;

import decorator.AddOnDecorator;
import tools.Tool;

public class AccessoryKit extends AddOnDecorator{

	static final int price = 18;
	
	public AccessoryKit(Tool tool, String name) {
		super(tool, name, price);
	}

	
}
