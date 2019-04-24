package interfaces;
import java.lang.reflect.Field;
import java.util.List;
import listeners.FieldListener;
import listeners.FragmentListener;
import listeners.LabelListener;
import listeners.ModelListener;

public interface CreatorInterface {
	public void process(String line, List<FragmentListener> fragmentListeners,  List<FieldListener> fieldlisteners,  List<LabelListener> labelListeners, List<ModelListener> modelListeners) throws Exception;
}
