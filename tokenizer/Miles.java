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
	    //
	    int result = 0;
	    for (int x=0;x<name.length();x++)
	    {
	        result = name.charAt(x) + result;
	    }
	    data = result % name.length();
	    return result;
	}
		int result = 0;
		int x = 0;
		while (x<name.length())
		{
		result = name.charAt(x) + result;
		x++;
		}
		data = result % name.length();
		return result;	}
	    //int result = 10;
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
