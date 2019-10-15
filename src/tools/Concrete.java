package tools;

public class Concrete implements Tools{
	
	private String name;
	
	public Concrete(String name)
	{
		this.name = name;
	}
	
	public double cost()
	{
		return 1.00;
	}
}
