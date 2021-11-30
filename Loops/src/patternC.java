
public class patternC 
{

	public static void main(String[] args) 
	{
		int num=6; 
		for(int i=1; i<=num; i++)
		{
			for(int j =num-1; j<=num-1; j--) //The inner loop should repeat for i times. 
			{
				System.out.print(j + " ");
			}
			System.out.println(" ");

		}
	}

}
