package Arrays;

public class test 
{

	public static void main(String[] args) 
	{
		int A1[] = {3,9,7,8,12,6,15,5,4,10}; 

		//PRINTING AN ARRAY
		int A[] = {1, 2, 3, 4, 5}; 
		for(int i=0; i<A.length; i++)
		{
			System.out.println(A[i]);
		}
		
		System.out.println("-----------");
		//PRINTING A REVERSE ARRAY
		for(int i=A.length-1; i>0; i--)
		{
			System.out.println(A[i]);
		}
		
		
		System.out.println("-------------------------");
		int max1, max2; 
		max1 = max2 = A1[0];
		for(int i=1; i<A1.length; i++)
		{
			if(A1[i] > max1)
			{
				max2=max1; 
				max1 = A1[i]; 
			}
			else if(A1[i] > max2)
			{
				max2 = A[i]; 
			}
		}
		System.out.println("second largest is: " + max2);

	}

}
