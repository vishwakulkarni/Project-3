package tools;

import java.util.ArrayList;
import java.util.List;

import Customers.Customer;
import factory.ToolFactory;

public class Inventory {
	
	List<Painting> paintings = new ArrayList<Painting> (5);
	List<Plumbing>  plumbings= new ArrayList<Plumbing> (5);
	List<Concrete>  concretes= new ArrayList<Concrete> (5);
	List<Woodwork>  woodworks= new ArrayList<Woodwork> (5);
	List<Yardwork>  yardworks= new ArrayList<Yardwork> (5);

	public Inventory(List<Painting> paintings,List<Plumbing>  plumbings,List<Concrete>  concretes,List<Woodwork>  woodworks,List<Yardwork>  yardworks) {
		this.paintings = paintings;
		this.plumbings = plumbings;
		this.concretes = concretes;
		this.woodworks = woodworks;
		this.yardworks = yardworks;
	}
	
	public void getPaintingTool()
	{
		for (Tool painting : paintings)
		{
			System.out.println(painting.getName());
			// System.out.println(painting.type);
		}
	}
	
	public void getPlumbingTool()
	{
		for (Tool plumbing : plumbings)
		{
			System.out.println(plumbing.getName());
		}
	}
	
	public void getConcreteTool()
	{
		for (Tool concrete : concretes)
		{
			System.out.println(concrete.getName());
		}
	}
	
	public void getWoodworkTool()
	{
		for (Tool woodwork : woodworks)
		{
			System.out.println(woodwork.getName());
		}
	}
	
	public void getYardworkTool()
	{
		for (Tool yardwork : yardworks)
		{
			System.out.println(yardwork.getName());
		}
	}
	
	public void updatePaintingInventory(Painting t, String action)
	{
		//System.out.println(t.type);
		if(t.type == "Painting")
		{
			if(action == "delete")
			{
				paintings.remove(t);
			}
			if(action == "add")
			{
				paintings.add(t);
			}
		}
	}
	
}
