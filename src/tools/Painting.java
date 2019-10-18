package tools;


/*
 * Class Painting
 * implements tool
 * which has a per object cost of 5 and can only have 5 instances
 */

public class Painting implements Tool{

	public static final int price = 5;
	public String name;
	public static int count = 5;
	public String type = "Painting";
	int nytNo;
	
	private Painting(String name,int nytNo){
		this.name=name;
		this.nytNo=nytNo;
		
	}
	
	public static Tool getInstance(String name,int nytNo) {
		
		if(count >= 1) {
			count--;
			return new Painting(name,nytNo);
		}
		else {
			return null;
		}
		
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int getPrice() {
		
		return price*nytNo;
	}
	
	@Override
	public void increaseCount() {
		
		 count = count+1;
	}

	@Override
	public String getAddOn() {
		// TODO Auto-generated method stub
		return "";
	}
	
}
