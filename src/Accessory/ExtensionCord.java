package Accessory;

import decorator.AddOnDecorator;
import tools.Tool;

public class ExtensionCord extends AddOnDecorator{

	static final int price = 16;
	
	public ExtensionCord(Tool tool) {
		super(tool, price);
	}

	
}
