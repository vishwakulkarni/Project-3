package tools;

public class Yardwork implements Tool{

	static final int price = 8;
	
	static int count = 4;
	public String type = "Yardwork";
	public String name;
	int nytNo;
	
	private Yardwork(String name,int nytNo){
		this.name=name;
		this.nytNo = nytNo;
	}
	
	public static Tool getInstance(String name,int nytNo) {
		
		if(count >= 1) {
			count--;
			return new Yardwork(name,nytNo);
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
