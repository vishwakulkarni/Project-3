package tools;

public class Plumbing implements Tools{
	
	private String name;
	
	public Plumbing(String name)
	{
		this.name = name;
	}
	
	public double cost()
	{
		return 3.00;
	}

}
