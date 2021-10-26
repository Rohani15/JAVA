package arraysAgain;

public class sumOfAllElements 
{

	public static void main(String[] args) 
	{
		int A[] = {3,9,7,8,12,6,15,5,4,10}; 
		
		int sum=0;
		for(int i=1; i<A.length; i++)
		{
			sum += A[i]; 
		}
		
		for(int x: A)
		{
			System.out.print(x + " ");
		}
		
		System.out.println(" The sum is " + sum);
	}

}
