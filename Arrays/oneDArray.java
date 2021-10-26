package Arrays;

public class oneDArray 
{

	public static void main(String[] args) 
	{
		//declare a 1d array
		int A[] = new int[10]; 
		
		//another method 
		int B[] = {1,2,3,4,5}; 
		
		int C[]; 
		C = new int[10]; 
		
		//change value 3 to 15 in the array
		B[2] = 15; 
		
		for(int i=0; i<B.length; i++) //need this loop to increment B because the foreach loop wont increment it unless another loop is there 
		{
			System.out.println(B[i]++);
		}
		for(int x: B)
		{
			System.out.println(x);
		}
		

	}

}
