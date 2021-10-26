package arraysAgain;

public class rightRotate 
{

	public static void main(String[] args) 
	{
		int [] A = {1,2,3,4,5};
		 
		int last=A[4];//holds last element which is 5
		 
		for (int i=A.length-1; i>0; i--)
		{
		    A[i]=A[i-1]; //Asiging indexes to new positions
		}
		A[0]=last; //moving element 5 to first index    
	    
	    //===========================================
	    for(int x: A)
	    {
	    	System.out.print(x +",");
	    }
	    


	}

}
