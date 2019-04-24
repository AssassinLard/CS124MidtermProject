package interfaces;

import java.util.List;

import listeners.FieldListener;
import listeners.FragmentListener;
import listeners.LabelListener;
import listeners.ModelListener;
import annotations.ParserAnnotation;

@ParserAnnotation(label="LABEL")
public class LabelCreator implements CreatorInterface{
	
	@Override
	public void process(String line, List<FragmentListener> fragmentListeners,  List<FieldListener> fieldlisteners,  List<LabelListener> labelListeners, List<ModelListener> modelListeners) throws Exception
	{
		String[] data = line.split(";");
		
		if (data.length<2)
		{
			throw new RuntimeException("not enough data for LABEL");
		}

		for (LabelListener fl : labelListeners)
		{
			fl.labelCreated(data[1].trim());
		}
	}	
}
