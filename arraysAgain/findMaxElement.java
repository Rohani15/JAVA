package arraysAgain;

public class findMaxElement 
{

	public static void main(String[] args)
	{
		int A[] = {3,9,7,8,12,6,15,5,4,10}; 
				
		//First have to traverse this array
		int max = A[0];
		for(int i=0; i<9; i++)
		{
			if(A[i] > max)
			{
				max = A[i]; 
			}
		}
		System.out.println(max);

		

		
	}

}
