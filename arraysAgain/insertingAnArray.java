package arraysAgain;

public class insertingAnArray 
{

	public static void main(String[] args) 
	{
		int A[] = new int[10]; 
		A[0]=5; A[1]=9; A[2]=8; A[3]=10; A[4]=12; A[5]=7; 
		int items = 10; 

		
		
		int n = 8; // Index A[2] 
		int index = 2; //Index
		int x=20; //The new element
		
		for(int i=n; i > index; i--)
		{
			A[i] = A[i-1]; 
		}
		A[index] = x; 
		
	    
		
		for(int b: A)
	    {
	    	System.out.print(b +", ");
	    }
		
	}

}
