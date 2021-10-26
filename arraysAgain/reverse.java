package arraysAgain;

public class reverse 
{

	public static void main(String[] args) 
	{
		int[] A = {1,2,3,4}; 
		int B[] = new int[4]; 
		
        for(int i=A.length-1,j=0;i>=0;i--,j++)
		{
			B[j] = A[i]; 
		}
		
		for(int x:B)
		{
			System.out.print(x + ", ");
		}
		
	}

}
