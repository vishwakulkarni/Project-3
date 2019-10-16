package decorator;

import tools.Tool;

public class AddOnDecorator implements Tool {

	 public Tool tool;
	 public int price;
	 public String addOn;
	
	
	public AddOnDecorator(Tool tool,int price,String addOn) {
		
		this.tool = tool;
		this.price = price;
		this.addOn = addOn;
	}
	
	public int getPrice() {
		
		return price+tool.getPrice();
		
	}

	@Override
	public void increaseCount() {
			
	}
	
	public String getName() {
		return this.tool.getName();
	}

	@Override
	public String getAddOn() {
		// TODO Auto-generated method stub
		return this.addOn;
	}

	
	
	
}
