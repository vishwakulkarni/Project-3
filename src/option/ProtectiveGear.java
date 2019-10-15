package option;

import tools.Tools;

public class ProtectiveGear extends OptionDecorator{
	
	Tools tool;
	
	public ProtectiveGear(Tools tool) {
		this.tool = tool;
	}
	
	public double cost() {
		
		return tool.cost() + .50;
	}

}
