import tools.*;
import option.*;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("starter code");
		
		ToolsFactory toolfactory = new ToolsFactory();
		Tools painttool1 = toolfactory.gettools("painting","Paint Tool 1");
		// System.out.println(painttool1.cost());
		painttool1 = new ProtectiveGear(painttool1);
		System.out.println(painttool1.cost());

	}

}
