package tools;

/*
 * Class Woodwork
 * implements tool
 * which has a per object cost of 8 and can only have 5 instances
 */

public class Woodwork implements Tool{

	static final int price = 8;
	
	static int count = 5;
	public String type = "Woodwork";
	public String name;
	int nytNo;
	
	private Woodwork(String name,int nytNo){
		this.name=name;
		this.nytNo = nytNo;
	}
	
	public static Tool getInstance(String name,int nytNo) {
		
		if(count >= 1) {
			count--;
			return new Woodwork(name,nytNo);
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
