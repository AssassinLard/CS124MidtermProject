package processors;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;

import listeners.FieldListener;
import listeners.FragmentListener;
import listeners.ModelListener;

public class JavaValidatorProcessor implements ModelListener, FragmentListener, FieldListener {

	String modelName;
	String fragmentName;

	StringBuilder validationMethodBuffer = new StringBuilder();
	StringBuilder validationCallBuffer = new StringBuilder();

	
	public JavaValidatorProcessor()
	{
		
	}


	public String createDependencyCheck(String fieldName, String type, String misc)
	{
		if (ParseUtils.hasMisc("DEPEND", misc))
		{
			String variable = ParseUtils.getMiscValue("DEPEND", misc);
			String[] valuesForcingValidation = ParseUtils.getMiscParams("DEPEND", misc);
			
			// WARNING: for now we assume everything are Integers or Double
			//			to do otherwise requires storing all the previous field information in the parser
						
			// WARNING: potential issue from fragment jumping (skipping pages), add null check first
			try
			{
				File template = new File("templates/validationDependencyCheck.txt");
				String content = FileUtils.readFileToString(template, Charset.defaultCharset());
				
				ArrayList<String> conditions = new ArrayList<>();
				for (String value : valuesForcingValidation)
				{
					try
					{
						// just a number
						conditions.add("model.get"+NameUtils.upcaseFirst(variable)+"()=="+Integer.parseInt(value));
					}
					catch(Exception e)
					{
						// expression fragment
						conditions.add("model.get"+NameUtils.upcaseFirst(variable)+"()"+value);
					}
				}
				
				StringBuilder sb = new StringBuilder();
				sb.append("(model.get"+NameUtils.upcaseFirst(variable)+"()==null || !(");
				
				for (Iterator<String> i = conditions.iterator(); i.hasNext(); )
				{
					String condition = i.next();
					sb.append(condition);
					if (i.hasNext())
					{
						sb.append(" || ");
					}
				}
				
				sb.append("))");
				
				content = content.replaceAll("\\{\\$CONDITIONS\\}", sb.toString());
				
				return content;

			}
			catch(Exception e)
			{
				throw new RuntimeException(e);
			}			
		}
		else
		{
			return "";
		}
	}
	
	
	@Override
	public void fieldCreated(String fieldName, String type, String misc) {
		// TODO Auto-generated method stub
		
		String javaFieldName = ParseUtils.extractJavaFieldName(fieldName, misc);
		
		
		if (ParseUtils.hasMisc("OPTIONAL", misc))
		{
			validationCallBuffer.append("\t\t//  ");
			validationCallBuffer.append(javaFieldName+" optional");
			validationCallBuffer.append("\n");
			return;
		}

		String dependencyCheck = createDependencyCheck(javaFieldName, type, misc);
		
		
		if (type.startsWith("MULTI:"))
		{
			String[] multiData = type.split(":");
			String optionString = multiData[1].substring(1, multiData[1].length()-1);
			String[] options = optionString.split(",");

			for (int i=0; i<options.length; i++)
			{
				String name = (String) options[i];


				if (name.toLowerCase().contains("(specify)"))
				{
					addValidation(javaFieldName+"Others", dependencyCheck, NameUtils.stripRadioAlias(name));
					addSpecifyValidation(javaFieldName+"Specify", javaFieldName+"Others", 1, NameUtils.stripRadioAlias(name), dependencyCheck);				
				}
				else
				{
					addValidation(javaFieldName+NameUtils.toJavaFieldNameAppender(name.trim()), dependencyCheck, NameUtils.stripRadioAlias(name));
				}
			}

		}
		else if (type.startsWith("SINGLE:"))
		{
			addValidation(javaFieldName, dependencyCheck, fieldName);
			
			// NEED TO LOOP ENTRIES to tie the specify
			String[] singleData = type.split(":");
			String optionString = singleData[1].substring(1, singleData[1].length()-1);
			String[] options = optionString.split(",");
			for (int i=0; i< options.length; i++)
			{
				String option = options[i];
				if (option.toLowerCase().contains("(specify"))
				{
					addSpecifyValidation(javaFieldName+"Specify", javaFieldName, i, fieldName+" "+option, dependencyCheck);				
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
					
			addValidation(javaFieldName, dependencyCheck, fieldName);
			
			if (addSpecifyField)
			{
				addSpecifyValidation(javaFieldName+"Specify", javaFieldName, 1, fieldName+" Specify", dependencyCheck);				
			}		
		}		
	}


	public void addValidation(String name, String dependencyCheck, String originalField)
	{
		if (fragmentName!=null)
		{
			addValidationCall(name);			
			addValidationMethod(name, dependencyCheck, originalField);
		}
	}
	
	public void addSpecifyValidation(String name, String checkableName, int position, String origName, String dependencyCheck)
	{
		if (fragmentName!=null)
		{
			addValidationCall(name);
			addSpecifyValidationMethod(name, checkableName, position, origName, dependencyCheck);
		}
	}
	
	public void addValidationCall(String name)
	{
		validationCallBuffer.append("\t\tvalidate"+NameUtils.upcaseFirst(name)+"();\n");
	}
	
	public void addValidationMethod(String javaFieldName, String dependencyCheck, String originalField)
	{
		try
		{
			File template = new File("templates/validatorMethod.txt");
			String content = FileUtils.readFileToString(template, Charset.defaultCharset());
			
			
			// dependency override?
			// add check for depends
						// if field is dependent on another model value
						// check if if that value meets specified criteria
						// if it does, then it is required (proceed)
						// otherwise return from the method
					
			content = content.replaceAll("\\{\\$DEPENDENCY_CHECK\\}", dependencyCheck);
			
			
			content = content.replaceAll("\\{\\$METHOD_NAME\\}", NameUtils.upcaseFirst(javaFieldName));
			content = content.replaceAll("\\{\\$FIELD_NAME\\}", javaFieldName);
			content = content.replaceAll("\\{\\$FRAGMENT_NAME\\}", fragmentName);
			content = content.replaceAll("\\{\\$ORIG_FIELD\\}", asResourceString(javaFieldName, originalField));  // TODO: USE RES
			
			validationMethodBuffer.append(content);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void addSpecifyValidationMethod(String name, String checkableName, int position, String originalField, String dependencyCheck)
	{
		try
		{
			File template = new File("templates/validatorSpecifyMethod.txt");
			String content = FileUtils.readFileToString(template, Charset.defaultCharset());
			
			content = content.replaceAll("\\{\\$DEPENDENCY_CHECK\\}", dependencyCheck);

			content = content.replaceAll("\\{\\$METHOD_NAME\\}", NameUtils.upcaseFirst(name));
			content = content.replaceAll("\\{\\$FIELD_NAME\\}", name);
			content = content.replaceAll("\\{\\$FRAGMENT_NAME\\}", fragmentName);

			content = content.replaceAll("\\{\\$METHOD_SELECTABLE_NAME\\}", NameUtils.upcaseFirst(checkableName));
			content = content.replaceAll("\\{\\$POSITION\\}", String.valueOf(position));
			content = content.replaceAll("\\{\\$ORIG_FIELD\\}", asResourceString(name, originalField));		// TODO: USE RES


			validationMethodBuffer.append(content);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void fieldDone() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void fragmentCreated(String fragmentName) {
		// TODO Auto-generated method stub
		this.fragmentName = fragmentName;
		
	}


	@Override
	public void fragmentDone() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void modelCreated(String modelName) {
		// TODO Auto-generated method stub
		this.modelName = modelName;
	}


	@Override
	public void modelDone() {
		// TODO Auto-generated method stub
		
		// save file

		try
		{
			File template = new File("templates/validator.txt");
			String content = FileUtils.readFileToString(template, Charset.defaultCharset());
			
			
			// update info
			content = content.replaceAll("\\{\\$MODEL_PACKAGE\\}", NameUtils.toPackageName(modelName));
			
			content = content.replaceAll("\\{\\$MODEL_CLASS\\}", NameUtils.toClassName(modelName));

			content = content.replaceAll("\\{\\$MODEL_VALIDATION\\}", validationCallBuffer.toString());
			content = content.replaceAll("\\{\\$VALIDATION_METHODS\\}", validationMethodBuffer.toString());
			
	
			
			File dir = new File("output/"+NameUtils.toPackageName(modelName)+"/gen");
			dir.mkdirs();
			
			File output = new File(dir, NameUtils.toClassName(modelName)+"Validator.java");
			FileWriter fw = new FileWriter(output);
			fw.write(content, 0, content.length());
			fw.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		
		
		
		
	}
	
	boolean useResourceStrings = true;
	
	public String asResourceString(String key, String s)
	{
		if (useResourceStrings)
		{
			if (s.startsWith("@drawable"))
			{
				return "\""+s+"\"";
			}
			
			// based on model
			String value = "context.getResources().getString(R.string."+NameUtils.toLayoutName(modelName)+"_"+key+")";
			return value;
		}
		return s;
	}
	
}
