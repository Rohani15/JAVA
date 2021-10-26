package arraysAgain;

public class searchAnElement 
{

	public static void main(String[] args) 
	{
		int A[] = {3,9,7,8,12,6,15,5,4,10}; 
		
		int key = 1; 
		
		for(int i=0; i<A.length; i++)
		{
			if(key == A[i])
			{
				System.out.println("The key " + key + " is in the array");
			}
			System.out.println("Not found");
			System.exit(0);
		}
		
 
	}

}
