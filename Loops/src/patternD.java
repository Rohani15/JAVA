
public class patternD 
{

	public static void main(String[] args) 
	{
		/*
	}
        for(int i=1;i<=5;i++)
        {
			for(int j = 1; j<=5-i+1; j++) //The inner loop should repeat for i times. 
        	{
				if(j<=i)
				{
	        		System.out.print(j + " ");
				}
        	}
			System.out.println(" ");
			*/
			
	        for(int i=1;i<=5;i++)
	        {
				for(int j = 1; j<=5-i+1; j++) //The inner loop should repeat for i times. 
	        	{
					if(j<=i)
					{
		        		System.out.print(j + " ");
					}
					else
					{
						System.out.println(" ");
					}
	        	}

						

        }
	}

}
