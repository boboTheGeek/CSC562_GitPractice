package tokenizer;

public class Miles
{
	int data;
	String name;

	public void nameMethod(String value)
	{
		name = value.substring(1);
	}

	public int dataMethod()
	{
		int result = 10;
		data = result % name.length();
		return result;

	}

	@Override
	public String toString()
	{
		String fancyName = "X "+name+" X";
	    return fancyName+" : "+data;
	}

}
