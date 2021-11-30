
public class numberDivByFiveSix 
{

	public static void main(String[] args) 
	{
		for(int i=100; i<=1_000; i++)
		{
			if(i % 5 == 0 ^ i % 6 == 0)
			{
				System.out.println(i + " ");
			}
			
			if(i % 10 == 0) System.out.println();
		}
	}

}
