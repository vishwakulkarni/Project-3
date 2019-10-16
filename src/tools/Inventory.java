package tools;

import java.util.ArrayList;
import java.util.List;

import Customers.Customer;
import factory.ToolFactory;

public class Inventory {
	
	List<Painting> paintings = new ArrayList<Painting> (5);
	List<Plumbing>  plubings= new ArrayList<Plumbing> (5);
	List<Concrete>  concretes= new ArrayList<Concrete> (5);
	List<Woodwork>  Woodwork= new ArrayList<Woodwork> (5);
	List<Yardwork>  yardworks= new ArrayList<Yardwork> (5);

	public Inventory(List<Painting> paintings,List<Plumbing>  plubings,List<Concrete>  concretes,List<Woodwork>  Woodwork,List<Yardwork>  yardworks) {
		this.paintings = paintings;
		this.plubings = plubings;
		this.concretes = concretes;
		this.Woodwork = Woodwork;
		this.yardworks = yardworks;
	}
}
