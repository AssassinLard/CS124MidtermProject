package processors;

import java.util.Arrays;

public class ParseUtils 
{

	public static String[] getMiscArray(String key, String misc)
	{
		String value = getMiscValue(key, misc);
		if (value==null)
		{
			return null;
		}
		
		if (value.startsWith("{") && value.endsWith("}"))
		{
			value = value.substring(1, value.length()-1);
			return value.split(",");
		}
		else
		{
			throw new RuntimeException("Not an array type: "+value);
		}
		
	}
	
	public static String getMiscValue(String key, String misc)
	{
		// split according to ,
		// split according to :
		// split according to {} ??
		if (misc==null)
		{
			return null;
		}
		
		String[] entries = misc.split("\\|");
		for (String entry: entries)
		{
			if (entry.startsWith(key))
			{
				return entry.split(":")[1].trim();
			}
		}
		
		return null;
				
	}
	
	public static String[] getMiscParams(String key, String misc)
	{
		// split according to ,
		// split according to :
		// split according to {} ??
		if (misc==null)
		{
			return null;
		}
		
		String[] entries = misc.split("\\|");
		for (String entry: entries)
		{
			if (entry.startsWith(key))
			{
				if (entry.split(":").length<3)
				{
					return null;
				}
				
				String params = entry.split(":")[2].trim();
				params = params.substring(1, params.length()-1);
				return params.split(",");
			}
		}
		
		return null;
				
	}
	
	public static boolean hasMisc(String key, String misc)
	{
		// split according to ,
		// split according to :
		// split according to {} ??
		
		if (misc == null) return false;
		
		String[] entries = misc.split("\\|");
		for (String entry: entries)
		{
			if (entry.trim().startsWith(key))
			{
				return true;
			}
		}
		
		return false;
				
	}	
	
	
	public static String extractJavaFieldName(String fieldName, String misc)
	{
		String javaFieldName;
		
		// check if name starts with @drawable/
		if (fieldName.startsWith("@drawable/"))
		{
			if (hasMisc("FIELDNAME", misc))
			{
				javaFieldName = getMiscValue("FIELDNAME", misc);
			}
			else
			{
				throw new RuntimeException("@drawable/ needs to have a FIELDNAME:");					
			}
		}
		else
		{
			javaFieldName = null;

			int alias = fieldName.indexOf("|");
			if (alias>-1)
			{
				javaFieldName = fieldName.substring(0, alias).trim();				
			}
			else
			{
				if (hasMisc("FIELDNAME", misc))
				{
					javaFieldName = getMiscValue("FIELDNAME", misc);
				}
				else
				{
					javaFieldName = NameUtils.toJavaFieldName(fieldName);
				}
			}
		}
		return javaFieldName;
	}
	
	
}
