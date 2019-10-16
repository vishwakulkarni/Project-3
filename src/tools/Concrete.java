package tools;

public class Concrete implements Tool{

	static final  int price = 6;
	public String name;
	static int count = 5;
	public String type = "Concrete";
	int nytNo;
	private  Concrete(String name,int nytNo){
		this.name = name;
		this.nytNo=nytNo;
	}
	
	public static Tool getInstance(String name,int nytNo) {
		
		if(count >= 1) {
			count = count-1;
			return new Concrete(name,nytNo);
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
