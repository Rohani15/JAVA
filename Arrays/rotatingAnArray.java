package Arrays;

public class rotatingAnArray 
{

	public static void main(String[] args) 
	{
		int A[] = {3,9,7,8,12,6,15,5,4,10}; 
		int temp = A[0]; 
		
		//Display all the elements of the array
		for(int x: A)
		{
			System.out.print(x + ", ");
		}
		
		
		//Rotating the array one spot to the left 
		for(int i=1; i<A.length; i++)
		{
			A[i-1] = A[i]; 
		}
		A[A.length -1] = temp; 
		
		
		
		System.out.println("------");
		//Display all the elements of the new rotated array
		for(int x: A)
		{
			System.out.print(x + ", ");
		}

	}

}
