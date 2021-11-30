
public class kiloToPoundsAndMiles 
{
	public static void main(String[] args) 
	{
		final double pounds = 2.2; 
		System.out.print("miles Kilometers           pounds Kilograms\n");
		for(int i=1, j=1; i<=199 && j<=515; i+=3, j+=5)
		{
			System.out.printf("%-12d%7.1f", i, (i * pounds));
			
			System.out.print("     |     ");

			
			System.out.printf("%-9d%12.2f\n",j, (j / pounds));

		}

	}


}
