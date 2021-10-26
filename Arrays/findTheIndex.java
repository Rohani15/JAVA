package Arrays;

public class findTheIndex 
{

	public static void main(String[] args) 
	{
		int A[] = {1,5,3}; 
		int key = 5; 
		
		for(int i=0; i<A.length; i++)
		{
			if(A[i] == key)
			{
				System.out.println("They key is: " + key);
				System.exit(0);
			}
		}
		System.out.println("Not available");
	}

}
