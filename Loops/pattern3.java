package Loops;

public class pattern3 
{

	public static void main(String[] args) 
	{
		for(int i = 0; i<=5; i++)
		{
			for(int j = 1; j<=5; j++) //The inner loop should repeat for i times. 
			{
				if(i<=j)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}
		System.out.println("--------------------------");
		
		/*
		* * * * *  
		* * * * *  
		  * * * *  
		    * * *  
		      * *  
		        *
	    */
		
		for(int i = 0; i<=5; i++)
		{
			for(int j = 1; j<=5; j++)
			{
				if(i + j > 6)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}
		System.out.println("--------------------------");
		
		/*
	         *  
	       * *  
	     * * *  
	   * * * *
	   
	   */
		
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; i<=5; j++)
			{
				
			}
		}
		
	}

}
