package methods;

public class reverseAnIntOrArray 
{

	public static void main(String[] args) 
	{
		int A[] = {1,2,3,4,5}; 
		//System.out.println(reverse(A));
		
		
	}
	
	 static int reverse(int value)
	{
		int rev=0;
		int r;
		
		while(value > 0)
		{
			r=value%10;
			rev = rev * 10 +r; 
			value/=10; 	
		}
		return rev; 
	}
	
	int [] reverse(int A[])
    {
        int B[]=new int[A.length];
        
        for(int i=A.length-1,j=0;i>=0;i--,j++)
            B[j]=A[i];
        
        return B;
    }

}
