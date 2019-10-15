package option;
import tools.*;

public class AccessoryKit extends OptionDecorator{
	
	Tools tool;
	
	public AccessoryKit(Tools tool) {
		this.tool = tool;
	}
	
	public double cost() {
		
		return tool.cost() + .20;
	}
	
	

}
