package Arrays;

public class checkLargestElement 
{

	public static void main(String[] args) 
	{
		int A[] = {3,9,7,8,12,6,15,5,4,10}; 
		int max = A[0]; //initialized to indez 0 which is 3
		
		for(int i=1; i<A.length; i++)
		{
			if(A[i] > max) //Will go through the loop and find the greatest number. 
			{
				max = A[i]; //sets max to the greatest number in the array. 
			}
		}
		System.out.println("The largest element is: " + max);
		
		System.out.println("-----------------");
		
		int B[] = {3,9,7,8,12,6,15,5,4,10}; 
		int max1, max2; 
		max1 = max2 = B[0]; 
		for(int i=1; i<B.length; i++)
		{
			if(B[i] > max1) //Will go through the loop and find the greatest number. 
			{
				max2 = max1; 
				max1 = B[i]; //sets max to the greatest number in the array. 
			}
			else if(B[i] > max2) //becareful to make is if the array b is > than max2 and not vice versa
			{
				max2 = B[i]; 
			}
		}
		System.out.println("The second largest element is: " + max2);
		
	}

}
