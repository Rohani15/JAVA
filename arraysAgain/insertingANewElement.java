package arraysAgain;

public class insertingANewElement 
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
		
		int n = 3; // Index A[2] 
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

