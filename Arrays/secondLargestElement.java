package Arrays;

public class secondLargestElement 
{
	/*
	 * Finding Sum of all the elements
	 * Searching an element
	 * Finding maximum element
	 * Finding second largest element
	 */
	
	public static void main(String[] args) 
	{
		int A[] = {3,9,7,8,12,6,15,5,4,10}; 
		
		//FINDING SUM OF ALL THE ELEMENTS 
		int sum = 0; 
		for(int i=0; i<A.length; i++)
		{
			 sum += A[i];
		}
		System.out.println(sum); 
		
		//FINDING SUM OF ALL THE ELEMENTS USING For each loop
		int sums = 0;
		for(int x: A)
		{
			sums += x; 
		}
		System.out.println(sums); 
		
		//SEARCHING FOR AN ELEMENT IN AN ARRAY
		int key = 6; 
		for(int i=1; i<A.length; i++)
		{
			if(key == A[i])
			{
				System.out.println("The key is: " + i);
				System.exit(0); 
			}
		}
		
		int max = A[0];
		for(int i=1; i<A.length; i++)
		{
			if(A[i] > max)
			{
				max = A[i]; 
			}
			System.out.println(max);
		}
		
		System.out.println("-------------------------");
		int max1, max2; 
		max1 = max2 = A[0];
		for(int i=1; i<A.length; i++)
		{
			if(A[i] > max1)
			{
				max2=max1; 
				max1 = A[i]; 
			}
			else if(A[i] > max2)
			{
				max2 = A[i]; 
			}
		}
		System.out.println("second largest is: " + max2);

	}

}
