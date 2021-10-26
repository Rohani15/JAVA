package Loops;

public class patterns2 
{

	public static void main(String[] args) 
	{
			for(int i = 0; i<=5; i++)
			{
				for(int j =1; j<=i; j++) //The inner loop should repeat for i times. 
				{
					System.out.print(j + " ");
				}
				System.out.println(" ");
			}
			System.out.println("--------------------------");
			
			/*
			 1  
			 1 2  
			 1 2 3  
			 1 2 3 4  
			 1 2 3 4 5 
			 */
			
			int count = 0;

			for(int i = 0; i<=5; i++)
			{
				for(int j =1; j<=i; j++) //The inner loop should repeat for i times. 
				{
					count++;
					System.out.print(count + " ");
				}
				System.out.println(" ");
			}
			System.out.println("--------------------------");
			
			/*
			1  
			2 3  
			4 5 6  
			7 8 9 10  
			11 12 13 14 15
			*/
			
			
			
			for(int i = 0; i<=5; i++)
			{
				for(int j =1; j<=i; j++) //The inner loop should repeat for i times. 
				{
					System.out.print("*");
				}
				System.out.println(" ");
			}
			System.out.println("--------------------------");
			
			/*
			 
			* 
			** 
			*** 
			**** 
			*****
			
			*/
			
			for(int i = 0; i<=5; i++)
			{
				for(int j = 1; j<=5-i+1; j++) //The inner loop should repeat for i times. 
				{
					System.out.print(j + " ");
				}
				System.out.println(" ");
			}
			System.out.println("--------------------------");
			/*
			1 2 3 4 5 6  
			1 2 3 4 5  
			1 2 3 4  
			1 2 3  
			1 2  
			1
			*/
	}

}


















