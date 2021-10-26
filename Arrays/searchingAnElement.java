package Arrays;

public class searchingAnElement 
{

	public static void main(String[] args) 
	{
		int A[] = {3,9,7,8,12,6,15,5,4,10}; 
		int key = 9; 
		for(int i=1; i<A.length; i++)
		{
			if(key == A[i])
			{
				System.out.println("The element found at: " + i);
				System.exit(0); 
			}
		}
		System.out.println("Element not found");


		
	}

}
