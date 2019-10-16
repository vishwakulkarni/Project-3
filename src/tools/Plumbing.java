package tools;

public class Plumbing implements Tool{

	static final int price = 7;
	
	static int count = 5;
	public String type = "Plumbing";
	public String name;
	int nytNo;
	
	private Plumbing(String name,int nytNo){
		this.name=name;
		this.nytNo=nytNo;
	}
	
	public static Tool getInstance(String name,int nytNo) {
		
		if(count >= 1) {
			count--;
			return new Plumbing(name,nytNo);
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
