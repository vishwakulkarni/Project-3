package tools;

public class Woodwork extends Tool{

	static final int price = 8;
	
	static int count = 5;
	
	private Woodwork(String name,int nytNo){
		this.name=name;
		this.nytNo = nytNo;
	}
	
	public static Woodwork getInstance(String name,int nytNo) {
		
		if(count >= 1) {
			count--;
			return new Woodwork(name,nytNo);
		}
		else {
			return null;
		}
		
	}
	
	@Override
	public int getPrice() {
		
		return price*nytNo;
	}
	
	
	@Override
	public void increaseCount() {
		
		 count = count+1;
	}
}
