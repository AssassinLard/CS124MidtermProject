package processors;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;

import org.apache.commons.io.FileUtils;

import listeners.FieldListener;
import listeners.FragmentListener;
import listeners.ModelListener;

public class JsonTemplateProcessor implements ModelListener, FragmentListener, FieldListener {

	boolean useSampleValues = true;
	
	String modelName;

	StringBuilder fieldBuffer = new StringBuilder();
	
	public JsonTemplateProcessor()
	{
		
	}
	
	private String getSampleValue(String type)
	{

		String[] data = type.split(":");
		
		
		switch (data[0].trim().toLowerCase())
		{
			case "string":
				if (data.length>1)
				{
					switch (data[1].toLowerCase())
					{
						case "number": 
							return "0";
						case "numberdecimal": 
							return "0.0";
						default:
							return "\"text\"";						
					}
				}
				else
				{
					return "\"text\"";
				}
				
			case "date":
				return "\"mm/dd/yyyy\"";
		
			case "list":
				return "[]";
				
			case "seekbar":
			case "seekbar2":
			case "single":
			case "single_img":
			case "checkbox":
			case "checkbox_img":
				return "0";
		}
		
		throw new RuntimeException("Unknown type: "+type);
	}
	
	
	@Override
	public void fieldCreated(String fieldName, String type, String misc) {
		// TODO Auto-generated method stub
		String javaFieldName = ParseUtils.extractJavaFieldName(fieldName, misc);

		
		// check if the field is a meant for custom runtime serialization
			// if it is, nothing is added at this point, just skip
		if (ParseUtils.hasMisc("JSONCUSTOM", misc))
		{
			return;
		}
		

		if (type.startsWith("MULTI:"))
		{
			String[] multiData = type.split(":");
			String optionString = multiData[1].substring(1, multiData[1].length()-1);
			String[] options = optionString.split(",");
			for (String name : options)
			{
				if (name.toLowerCase().contains("(specify)"))
				{
					addSimpleField(javaFieldName+"Others", "CHECKBOX");
					addSimpleField(javaFieldName+"Specify", "STRING");				
				}
				else
				{
					addSimpleField(javaFieldName+NameUtils.toJavaFieldNameAppender(name.trim()), "CHECKBOX");
				}
			}

		}
		else if (type.startsWith("SINGLE:"))
		{
			addSimpleField(javaFieldName, type);
			
			// NEED TO LOOP ENTRIES to tie the specify
			String[] singleData = type.split(":");
			String optionString = singleData[1].substring(1, singleData[1].length()-1);
			String[] options = optionString.split(",");
			for (int i=0; i< options.length; i++)
			{
				String option = options[i];
				if (option.toLowerCase().contains("(specify"))
				{
					addSimpleField(javaFieldName+"Specify", "STRING");				
					break;  // assume only one Specify field per group
				}					
			}
			
		}
		else
		{
			boolean addSpecifyField = false;
			if (type.equals("CHECKBOX:SPECIFY"))
			{
				addSpecifyField = true;
			}
					
			addSimpleField(javaFieldName, type);
			
			if (addSpecifyField)
			{
				addSimpleField(javaFieldName+"Specify", "STRING");				
			}		
		}	
	}
	

	private void addSimpleField(String javaFieldName, String type) {
		// javaType just determines if value will have a ""
		
//		,"src_maternity_info": 0
//		,"child_name": "Name of child"
		
		String jsonKey = NameUtils.javaFieldNameToJson(javaFieldName);		
		StringBuilder sb = fieldBuffer;

		addTabs(sb);
		// add key only if fresh
		sb.append(",\""); 
		sb.append(jsonKey);	
		sb.append("\":");

		sb.append(getSampleValue(type));
		sb.append("\n");
		
	}
	
	
	@Override
	public void modelCreated(String modelName) {
		// TODO Auto-generated method stub
		this.modelName = modelName;
	}

	@Override
	public void modelDone() {
		// TODO Auto-generated method stub
		try
		{
			File pojoTemplate = new File("templates/json.txt");
			String content = FileUtils.readFileToString(pojoTemplate, Charset.defaultCharset());
			
			
			// update info
			content = content.replaceAll("\\{\\$MODEL_NAME\\}", NameUtils.toClassName(modelName));
				// {$FIELDS}
			content = content.replaceAll("\\{\\$FIELDS\\}", fieldBuffer.toString());

			File dir = new File("output/json");
			dir.mkdirs();
			
			File output = new File(dir, NameUtils.toClassName(modelName)+".json");
			FileWriter fw = new FileWriter(output);
			fw.write(content, 0, content.length());
			fw.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private void addTabs(StringBuilder sb)
	{
		sb.append("\t\t");
	}




	@Override
	public void fieldDone() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fragmentCreated(String fragmentName) {
		// TODO Auto-generated method stub
		fieldBuffer.append("\n\n");
	}

	@Override
	public void fragmentDone() {
		// TODO Auto-generated method stub
		
	}

	
	
}
