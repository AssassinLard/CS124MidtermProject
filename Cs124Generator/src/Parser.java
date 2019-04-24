import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import listeners.FieldListener;
import listeners.FragmentListener;
import listeners.LabelListener;
import listeners.ModelListener;
import processors.JavaSerializerProcessor;
import processors.JavaValidatorProcessor;
import processors.JsonTemplateProcessor;
import processors.PojoProcessor;
import interfaces.CreatorInterface;
import io.github.lukehutch.fastclasspathscanner.FastClasspathScanner;
import io.github.lukehutch.fastclasspathscanner.scanner.ScanResult;
import annotations.*;

public class Parser
{
	private String dataFile;
	private HashMap<String, CreatorInterface> map;
	@SuppressWarnings("deprecation")
	public Parser(String file) throws InstantiationException, IllegalAccessException, Exception
	{
		dataFile = file;
		
		// pojo java file generator
		PojoProcessor pojoProcessor = new PojoProcessor();
		addListener(pojoProcessor);		
		

		addListener(new JavaValidatorProcessor());
		addListener(new JavaSerializerProcessor());

		addListener(new JsonTemplateProcessor());
		map = new HashMap<>();
		ScanResult results = new FastClasspathScanner("interfaces").scan();		
		List<String> allResults = results.getNamesOfClassesWithAnnotation(ParserAnnotation.class);
		for (String s : allResults)
		{
			Class cc = Class.forName(s);
			ParserAnnotation pa = (ParserAnnotation) cc.getAnnotation(ParserAnnotation.class);
			map.put(pa.label(), (CreatorInterface) cc.newInstance());
		}
	}
	
	public void addListener(Object o)
	{
		if (o instanceof ModelListener)
		{
			addModelListener((ModelListener) o);
		}
		if (o instanceof FragmentListener)
		{
			addFragmentListener((FragmentListener) o);		
		}
		if (o instanceof FieldListener)
		{
			addFieldListener((FieldListener) o);			
		}
		if (o instanceof LabelListener)
		{
			addLabelListener((LabelListener) o);
		}
	}
	
	public void parse() throws Exception
	{
		// read line
		//	read MODEL:name
			// generate POJO file (no getter/setter, no toString)
			// generate Activity class
		//  read FRAGMENT:name
			// generate new fragment layout (save previous if any)
			// generate fragment class (save previous if any)
		
		//  FIELD no prefix == FIELD
			// name
				// generate javaFieldName unless FIELDNAME present
			// type
				// STRING: input
				// SINGLE: {values}
				// CHECKBOX
				// DATE
					// DATE: needs adding code to trigger the date processing
			// misc
				// FIELDNAME:javaFieldName
		
			// add to POJO, add to fragment, add to fragment layout, 			
			// add Fragment init to Activity class


		//	prefix LABEL:name
			// adds a TextView/Spacer to the fragment layout
		
		Scanner scanner = new Scanner(new File(dataFile));
		
		while(scanner.hasNextLine())
		{
			String line = scanner.nextLine().trim();
			try {
				String[] aline = line.split(";");
				if (line.trim().isEmpty()) {
					continue;
				}
				if (line.startsWith("#")) {
					continue;
				}
				CreatorInterface ci = map.get(aline[0]);
				if(ci != null) {
					ci.process(line,fragmentListeners, fieldListeners, labelListeners, modelListeners);
				}
			} catch (RuntimeException e) {
				// TODO Auto-generated catch block
				System.out.println("ERROR in line: "+line);
				e.printStackTrace();
				throw e;			
			}
		}
		
		// trigger done to commit all files
		for (ModelListener ml : modelListeners)
		{
			ml.modelDone();
		}
	}
	
	
	private List<FieldListener> fieldListeners = new ArrayList<>();
	
	public void addFieldListener(FieldListener fl)
	{
		fieldListeners.add(fl);
	}

	private List<FragmentListener> fragmentListeners = new ArrayList<>();
	
	public void addFragmentListener(FragmentListener fl)
	{
		fragmentListeners.add(fl);
	}

	private List<ModelListener> modelListeners = new ArrayList<>();
	
	public void addModelListener(ModelListener fl)
	{
		modelListeners.add(fl);
	}
	
	private List<LabelListener> labelListeners = new ArrayList<>();
	
	public void addLabelListener(LabelListener fl)
	{
		labelListeners.add(fl);
	}
	
}
