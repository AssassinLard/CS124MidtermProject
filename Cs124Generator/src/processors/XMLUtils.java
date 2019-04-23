package processors;

import java.io.File;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class XMLUtils {

	
	public static String getTemplate(String s) throws Exception
	{
		String[] data = s.split(":");
		
		String fileName;
		switch(data[0].trim())
		{		
			case "SEEKBAR": 
				fileName = "seekbar.txt";
				break;

			case "SEEKBAR2": 
				fileName = "seekbar2.txt";
				break;

				
			case "BIGDIVIDER": 
				fileName = "bigDivider.txt";
				break;
				
			case "SMALLDIVIDER": 
				fileName = "smallDivider.txt";
				break;
	
			case "LABEL": 
				fileName = "label.txt";
				break;
			
			case "RADIOBUTTON": 
				fileName = "singleselectEntry.txt";
				break;
			case "CHECKBOX": 
				fileName = "multiselectEntry.txt";
				break;
			case "MULTI": 
				fileName = "multiselect.txt";
				break;
			case "SINGLE_IMG": 
				fileName = "singleselectImg.txt";
				break;
			case "SINGLE": 
				fileName = "singleselect.txt";
				break;
			case "DATE":
				fileName = "date.txt";
				break;
			case "STRING": 
//				fileName = "textinput.txt";
				fileName = "textinput2.txt";
				break;
				
			case "CHECKBOX_IMG": 
				fileName = "multiselectEntryImg.txt";
				break;

			case "RADIOBUTTON_IMG": 
				fileName = "singleselectEntryImg.txt";
				break;

			default:
				throw new RuntimeException("Unknown type for "+s);
		}
		
		File template = new File("templates/"+fileName);
		String content = FileUtils.readFileToString(template, Charset.defaultCharset());
		
		return content;

	}
}
