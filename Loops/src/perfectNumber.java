
public class perfectNumber 
{

	public static void main(String[] args) 
	{
		//need nested loops 
		for(int i=1; i<=10_000; i++)
		{
			int sum = 0;
			for(int j=1; j < i; j++)
			{
				if(i % j == 0)
				{
					sum+=j;  
				}
			}
			//System.out.println(sum);
			
			if(i==sum)
			{
				System.out.println(i);
			}
		}
	}

}
