package sta_category;

public class Type {
	public String value;
	protected int times = 0;

	public Type(String v)
	{
		value = v;
	}
	

	protected void add() {
		this.times++;
	}
}
