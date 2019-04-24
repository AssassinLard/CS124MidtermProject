package listeners;

public interface FieldListener 
{
	public void fieldCreated(String fieldName, String type, String misc);
	public void fieldDone();
}
