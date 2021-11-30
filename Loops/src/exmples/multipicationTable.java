package exmples;

public class multipicationTable 
{

	public static void main(String[] args) 
	{
		//Display the number title
		System.out.println("           Multiplication Table");
		
		//display the number title
		System.out.print(" ");
		
		for (int j = 1; j <= 9; j++)
		{
			System.out.print("   " + j);
		}
		
		System.out.println("\n--------------------------------------");
		
		//display table body
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=9; j++)
			{
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}
	}

}
