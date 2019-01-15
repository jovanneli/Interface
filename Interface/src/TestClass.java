
public class TestClass 
{

	public static void main(String[] args) 
	{
		DefaultFormatter defaultFormatter = new DefaultFormatter();
		DecimalFormatter decimal = new DecimalFormatter();
		BaseTwoFormatter baseTwo = new BaseTwoFormatter();
		System.out.println(defaultFormatter.format(525000));
		System.out.println(decimal.format(525000));
		System.out.println(baseTwo.format(8));
	}

}
