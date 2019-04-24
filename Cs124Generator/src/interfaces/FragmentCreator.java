package interfaces;

import java.util.List;

import listeners.FieldListener;
import listeners.FragmentListener;
import listeners.LabelListener;
import listeners.ModelListener;
import annotations.ParserAnnotation;

@ParserAnnotation(label="FRAGMENT")
public class FragmentCreator implements CreatorInterface{
	
	@Override
	public void process(String line, List<FragmentListener> fragmentListeners,  List<FieldListener> fieldlisteners,  List<LabelListener> labelListeners, List<ModelListener> modelListeners) throws Exception
	{
		String[] data = line.split(";");
		
		if (data.length<2)
		{
			throw new RuntimeException("not enough data for FRAGMENT");
		}

		for (FragmentListener fl : fragmentListeners)
		{
			fl.fragmentCreated(data[1].trim());
		}
	}
}
