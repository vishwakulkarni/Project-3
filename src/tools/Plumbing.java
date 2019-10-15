package tools;

public class Plumbing extends Tool{

	static final int price = 7;
	
	static int count = 5;
	
	private Plumbing(String name,int nytNo){
		this.name=name;
		this.nytNo=nytNo;
	}
	
	public static Plumbing getInstance(String name,int nytNo) {
		
		if(count >= 1) {
			count--;
			return new Plumbing(name,nytNo);
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
