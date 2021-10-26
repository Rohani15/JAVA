package arraysAgain;

public class rotatingAnArrayLeft 
{

	public static void main(String[] args) 
	{
		int A[] = {1,2,3,4,5}; 
		
		int temp = A[0]; //5

        for (int i = 1; i < A.length; i++) 
        {
        	System.out.print(A[i]+ ",");
        }
        A[A.length - 1] = temp;                           
        System.out.println(temp);
        

     
	
		//Rotating to the right
        int temp2 = A.length-1; 
	    for (int i = A.length-1; i >= A.length; i--) 
	    {
	    	System.out.print(A[i]+ ",");
	    }
	    A[0] = temp; 
	    System.out.println(temp2);
	
	
	
	
	
	}

}