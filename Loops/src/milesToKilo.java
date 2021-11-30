
public class milesToKilo 
{

	public static void main(String[] args) 
	{
		final double kilo = 1.609; 
		
		System.out.print("miles Kilometers \n");
		for(int i=1; i<=10; i+=2)
		{
			double total = i * kilo; 
			System.out.println(i + "     " + total);
		}
		
	}

}
