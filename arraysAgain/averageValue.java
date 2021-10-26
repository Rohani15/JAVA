package arraysAgain;

public class averageValue 
{

	public static void main(String[] args) 
	{
		int A[] = {1,2,3,4,5}; 
		
		int avg=0;
		for(int i=0; i<A.length; i++)
		{
			avg += A[i]; 
		}
		avg = avg / A.length; 
		System.out.println(avg);
		

	}

}
