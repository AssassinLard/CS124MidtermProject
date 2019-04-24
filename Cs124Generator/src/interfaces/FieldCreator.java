package interfaces;

import java.util.List;
import listeners.FieldListener;
import listeners.FragmentListener;
import listeners.LabelListener;
import listeners.ModelListener;
import annotations.ParserAnnotation;

@ParserAnnotation(label="FIELD")
public class FieldCreator implements CreatorInterface{
	
	@Override
	public void process(String line, List<FragmentListener> fragmentListeners,  List<FieldListener> fieldlisteners,  List<LabelListener> labelListeners, List<ModelListener> modelListeners) throws Exception
	{
		String[] data = line.split(";");
		
		if (data.length<2)
		{
			throw new RuntimeException("not enough data for FIELD: "+line);
		}
		
		for (FieldListener fl : fieldlisteners)
		{
			fl.fieldCreated(data[0].trim(), data[1].trim(), data.length>2 ? data[2].trim() : null);
		}
	}
}
