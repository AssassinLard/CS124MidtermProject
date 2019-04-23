package processors;

import java.io.UnsupportedEncodingException;

public class NameUtils 
{
    static String toCamelCase(String s){
        String[] parts = s.split(" ");
        String camelCaseString = "";
        for (String part : parts){
            if(part!=null && part.trim().length()>0)
           camelCaseString = camelCaseString + toProperCase(part);
            else
                camelCaseString=camelCaseString+part;   
        }
        return camelCaseString;
     }
    
    static String javaFieldNameToJson(String s)
    {
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = 0; i<s.length(); i++)
    	{
    		char c = s.charAt(i);
    		if (Character.isUpperCase(c))
    		{
    			sb.append("_");
    			sb.append(Character.toLowerCase(c));
    		}
    		else
    		{
    			sb.append(c);
    		}
    	}
    	
    	return sb.toString();
    }
    

     static String toProperCase(String s) {
         String temp=s.trim();
         String spaces="";
         if(temp.length()!=s.length())
         {
         int startCharIndex=s.charAt(temp.indexOf(0));
         spaces=s.substring(0,startCharIndex);
         }
         temp=temp.substring(0, 1).toUpperCase() +
         spaces+temp.substring(1).toLowerCase();
         return temp;

     }
     
     
     public static String toJavaFieldName(String temp)
     {    	 
    	 temp = stripRegExChars(temp);
    	 
    	 temp = temp.replaceAll("_", " ");
    	 temp = temp.replaceAll("@drawable", "");

    	 // if @drawable/ is present remove it
    	 
    	 
    	 temp = toCamelCase(temp);
    	 temp = temp.substring(0, 1).toLowerCase()+temp.substring(1);

    	 // WARNING REALM HAS A COLUMN NAME LIMIT 57 utf8 chars
    	 
		if (temp.length()>20)
		{
				 //temp = temp.substring(0,20);
				 System.out.println("WARNING LONG NAME: "+temp);
				 try
				 {
					 throw new Exception();
				 }
				 catch(Exception e)
				 {
					 e.printStackTrace();
				 }
		}    	 
    	 
    	 
    	 return temp;
     }

     
     public static String stripRadioAlias(String fieldName)
 	{
 		int alias = fieldName.indexOf("|");
 		if (alias>-1)
 		{
 			 return fieldName.substring(alias+1);				
 		}
 		return fieldName;
 	}
     
     public static String toJavaFieldNameAppender(String temp)
     {
    	 
    	 // if prefix is present just use that
		int alias = temp.indexOf("|");
		if (alias>-1)
		{
			return NameUtils.upcaseFirst(temp.substring(0, alias).trim());				
		}

    	 
	   	 temp = stripRegExChars(temp);
		 
	   	 temp = temp.replaceAll("_", " ");
	   	 temp = temp.replaceAll("@drawable", "");
	

    	 // if @drawable/ is present remove it
    	 
    	 temp = toCamelCase(temp);
    	 
    	 return temp;     
     }
     
     public static String toPackageName(String text)
     {
    	 return toCamelCase(text).toLowerCase();
     }

     public static String upcaseFirst(String text)
     {
    	 return text.substring(0,1).toUpperCase()+text.substring(1);
     }

     
     public static String toLayoutName(String temp)
     {
    	 temp = stripRegExChars(temp);

    	 temp = temp.replaceAll(" ", "_");
    	 return toCamelCase(temp).toLowerCase();
     }

     public static String toClassName(String temp)
     {
    	 temp = stripRegExChars(temp);
    	 temp = temp.replaceAll("@drawable", "");
    	 temp = temp.replaceAll("_", " ");
    	 return toCamelCase(temp);
     }

	private static String stripRegExChars(String temp) {
		 temp = temp.replaceAll("\'", "");
    	 temp = temp.replaceAll("/", "");
    	 temp = temp.replaceAll("-", " ");
    	 temp = temp.replaceAll("\\?", "");
    	 temp = temp.replaceAll("\\(", "");
    	 temp = temp.replaceAll("\\)", "");
 		 temp = temp.replaceAll(",", "");
 		 temp = temp.replaceAll("\\.", "");
		 return temp;
	}
	
	
	public static String useResourceName(String resName)
	{
		return "@string/"+resName;
	}

}
