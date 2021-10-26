package arraysAgain;

public class copyingAnArray 
{

	public static void main(String[] args) 
	{
		int A[] = {3,9,7,8,12,6,15,5,4,10}; 
		int B[] = new int [9]; 
		
        for(int i=0;i<9;i++)
		{
			B[i] = A[i]; //make sure B is first
		}
		
		for(int x: B)
		{
			System.out.print(x + ", ");
		}
		
	}

}
