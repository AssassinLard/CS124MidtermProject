package listeners;

public interface FieldListener 
{
	public void fieldCreated(String fieldName, String type, String misc);
	public void fragmentCreated(String fragmentName);
	public void modelCreated(String modelName);
	public void modelDone();
}
