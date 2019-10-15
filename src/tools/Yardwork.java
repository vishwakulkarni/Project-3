package tools;

public class Yardwork implements Tools{
	
private String name;
	
	public Yardwork(String name)
	{
		this.name = name;
	}
	
	public double cost()
	{
		return 5.00;
	}

}
