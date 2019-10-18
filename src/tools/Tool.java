package tools;

/*
 * Interface Tool
 * This will set template for all tool types
 */

public interface Tool {

	//public final String type = null;
	public int getPrice();
	public void increaseCount();
	public String getName();
	public String getAddOn();

}
