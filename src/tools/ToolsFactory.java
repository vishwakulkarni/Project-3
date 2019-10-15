package tools;

public class ToolsFactory {
	
	public Tools gettools(String tool_type, String name)
	{
		if(tool_type == null)
		{
			return null;
		}
		if(tool_type.equalsIgnoreCase("painting"))
		{
			return new Painting(name);
		}
		else if(tool_type.equalsIgnoreCase("plumbing"))
		{
			return new Plumbing(name);
		}
		else if(tool_type.equalsIgnoreCase("concrete"))
		{
			return new Concrete(name);
		}
		else if(tool_type.equalsIgnoreCase("woodwork"))
		{
			return new Woodwork(name);
		}
		else if(tool_type.equalsIgnoreCase("yardwork"))
		{
			return new Yardwork(name);
		}
		
		return null;
	}

}
