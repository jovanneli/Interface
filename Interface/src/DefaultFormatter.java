
public class DefaultFormatter implements NumberFormatter
{
	public String format(int num)
	{
		String integer = Integer.toString(num);
		String reversed = "";
		int count = 0;
		for(int i = integer.length()-1; i >= 0; i--)
		{
			reversed += integer.charAt(i);
			count++;
			if(count%3 == 0)
				reversed += ",";
		}
		String formatted = "";
		for(int i = reversed.length()-1; i >= 0; i--)
		{
			formatted += reversed.charAt(i);
		}
		if(integer.length()%3 == 0)
			return formatted.substring(1);
		return formatted;
	}
}
