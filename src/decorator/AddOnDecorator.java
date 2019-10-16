package decorator;

import tools.Tool;

public class AddOnDecorator implements Tool {

	 public Tool tool;
	 public int price;
	
	
	public AddOnDecorator(Tool tool,int price) {
		
		this.tool = tool;
		this.price = price;
	}
	
	public int getPrice() {
		
		return price+tool.getPrice();
		
	}

	@Override
	public void increaseCount() {
			
	}
	
	public String getName() {
		return null;
	}

	
	
	
}
