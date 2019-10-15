package decorator;

import tools.Tool;

public class AddOnDecorator extends Tool {

	 public Tool tool;
	public int price;
	
	
	public AddOnDecorator(Tool tool,String name,int price) {
		
		this.tool = tool;
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		
		return price+tool.getPrice();
		
	}

	@Override
	public void increaseCount() {
		
		
	}

	
	
	
}
