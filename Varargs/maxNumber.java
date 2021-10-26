package Varargs;

public class maxNumber 
{

	public static void main(String[] args) 
	{
		//max of number: 
		System.out.println(max(7,10,20,30)); 
		 
	}
	
	static int max(int ...A)
	{
		if(A.length == 0) return Integer.MIN_VALUE; 
		int m=A[0]; 
		for(int i=1; i<A.length; i++)
		{
			if(A[i] > m) return m; 
		}
		return m; 
	}
	
	static int sum(int ...A)
	{
		int s=0;
		for(int i=0; i<A.length; i++)
		{
			return s+=A[i] ;
		}
		return s; 
	}
	
    static double sum(double ...P) //P = Prices
    {
    	int sum=0; 
    	if(sum < 500) return sum*1.10; 
    	else if(sum >= 500 && sum<1+000) return sum*0.15; 
    	else return sum*0.20; 
    }

}
