package arraysAgain;

public class deleteingAnArray 
{

	public static void main(String[] args)
	{
		int A[] = new int[10]; 
		A[0]=1; 
		A[1]=2; 
		A[2]=3; 
		A[3]=4; 
		A[4]=5;
		A[5]=6; 
		
        for (int i = 1; i < A.length; i++) 
        {
        	System.out.print(A[i] + ", ");
        }


	}

}
