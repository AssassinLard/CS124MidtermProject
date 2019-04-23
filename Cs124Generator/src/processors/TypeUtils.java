package processors;

public class TypeUtils {

	// TODO:
	// need a method that generates code that applies a getter from a model and properly converts
	// that value to the UI widget, e.g setText(), setSelected(), setChecked(), etc
	// and reverse operation
	
	
	public static String getPojoType(String s)
	{
		String[] data = s.split(":");
		
		switch(data[0].trim())
		{
			case "SEEKBAR": 
			case "SEEKBAR2": 
			case "CHECKBOX": 
			case "SINGLE":
			case "SINGLE_IMG":
			case "MULTI":	
				return "Integer";
			case "DATE":
				return "String";
			case "STRING": 
						   if (data.length>1)
						   {
							   if (data[1].trim().equals("number"))
							   {
									return "Integer";
							   }
							   else if (data[1].trim().equals("numberDecimal"))
							   {
									return "Double";
							   }
							   else
							   {
								   return "String";
							   }
						   }
						   else
						   {
							   return "String";
						   }
			default:
				throw new RuntimeException("Unknown type for "+s);
		}
	}
	
	
	public static String getViewType(String s)
	{
		String[] data = s.split(":");
		
		switch(data[0].trim())
		{
			case "SEEKBAR": 
			case "SEEKBAR2": 
				return "SeekBar";		
			case "CHECKBOX": 
				return "CheckBox";
			case "SINGLE": 
			case "SINGLE_IMG": 
				return "RadioGroup";
			case "DATE":
			case "STRING": 
				return "EditText";
			default:
				throw new RuntimeException("Unknown type for "+s);
		}
	}
}
