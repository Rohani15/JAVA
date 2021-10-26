package arraysAgain;

//Write a Java program to find the duplicate values of an array of integer values.

public class duplicateValues 
{

	public static void main(String[] args) 
	{
		int A[] = {1,2,2,3,4}; 
		
		//traverse the array
		for(int i=0; i<A.length; i++)
		{
			for(int j=1+1; j<A.length; j++) //j+1 means moving the array along
			{
				if(A[i] == A[j])
				{
					System.out.println(A[j]);
					System.exit(0); 
				}
			}
		}
	}

}
