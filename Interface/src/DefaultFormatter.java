
public class DefaultFormatter implements NumberFormatter
{
	public String format(int num)
	{
		String integer = Integer.toString(num);
		String reversed = "";
		for(int i = integer.length()-1; i >= 0; i--)
		{
			reversed += integer.charAt(i);
			if(reversed.length() % 3 == 0)
				reversed += ",";
		}
		String formatted = "";
		for(int i = reversed.length()-1; i >= 0; i--)
		{
			formatted += reversed.charAt(i);
		}
		return formatted;
	}
}
