package Arrays;

/*
 * Create a function that takes an array and returns the difference between the biggest and smallest numbers.
 */

public class differenceMaxAndMinArray 
{

	public static void main(String[] args) 
	{
		int A[] = {10, 4, 1, 4, -10, -50, 32, 21}; //32, and -50
		System.out.println(A);
	}
	
	public static int differenceMaxMin(int[] A) 
	{
		int max=A[0]; 
		int min=A[0]; //dont initialize min to 0 
		
		for(int x: A)
		{
			if(x > max) 
				max = x; 
			if(x < min) 
				min = x; 
		}
		int answer = max-min;
		return answer; 			
	}


}
