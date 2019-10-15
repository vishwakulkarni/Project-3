package option;
import tools.Tools;

public class ExtensionCord extends OptionDecorator {
	
	Tools tool;
	
	public ExtensionCord(Tools tool) {
		this.tool = tool;
	}
	
	public double cost() {
		
		return tool.cost() + .40;
	} 

}
