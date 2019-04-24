package interfaces;

import java.util.List;

import listeners.FieldListener;
import listeners.FragmentListener;
import listeners.LabelListener;
import listeners.ModelListener;
import annotations.ParserAnnotation;

@ParserAnnotation(label="MODEL")
public class ModelCreator implements CreatorInterface{
	
	@Override
	public void process(String line, List<FragmentListener> fragmentListeners,  List<FieldListener> fieldlisteners,  List<LabelListener> labelListeners, List<ModelListener> modelListeners) throws Exception
	{
		String[] data = line.split(";");
		
		if (data.length<2)
		{
			throw new RuntimeException("not enough data for MODEL");
		}

		for (ModelListener fl : modelListeners)
		{
			fl.modelCreated(data[1].trim());
		}
	}	
}
