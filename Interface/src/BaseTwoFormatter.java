
public class BaseTwoFormatter implements NumberFormatter
{
	public String format(int num)
	{
		String reversed = "";
		boolean terminate = true;
		while(terminate)
		{
			if(num%2 == 0)
				reversed += "0";
			else if(num%2 != 0)
				reversed += "1";
			num = num/2;
			if(num == 0)
				terminate = false;
		}
		String formatted = "";
		for(int i = reversed.length()-1; i >= 0; i--)
		{
			formatted += reversed.charAt(i);
		}
		return formatted;
		
		
	}
}
