package tools;

public class Concrete extends Tool{

	static final  int price = 6;
	
	static int count = 5;
	
	private  Concrete(String name,int nytNo){
		this.name = name;
		this.nytNo=nytNo;
	}
	
	public static Concrete getInstance(String name,int nytNo) {
		
		if(count >= 1) {
			count = count-1;
			return new Concrete(name+count,nytNo);
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
