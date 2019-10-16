package Accessory;

import decorator.AddOnDecorator;
import tools.Tool;

public class ProtectiveGearPack extends AddOnDecorator{

	static final int price = 25;
	
	public ProtectiveGearPack(Tool tool) {
		super(tool, price);
	}

	
}
