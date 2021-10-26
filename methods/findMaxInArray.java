package methods;

public class findMaxInArray 
{

	public static void main(String[] args) 
	{
		int A[] = {8,3,15,9,7}; 
		System.out.println(max(A));

	}
	
	static int max(int A[])
	{		
		int max = A[0]; 

		for(int i=0; i<=4; i++)
		{
			if(A[i] > max)
			{
				max = A[i]; 
			}
		}
		return max; 
		
	}

}
