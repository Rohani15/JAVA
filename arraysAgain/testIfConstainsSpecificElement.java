package arraysAgain;

//Write a Java program to test if an array contains a specific value
public class testIfConstainsSpecificElement 
{

	public static void main(String[] args) 
	{
		int A[] = {1,4,7,2,9}; 
		int n=9; 
		
		for(int i=0; i<A.length; i++)
		{
			if(n == A[i])
			{
				System.out.println(n + " is in the array");
			}
		}
		

	}

}
