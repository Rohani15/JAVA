package methods;

public class objectPassing //changing one of the elements
{
	public static void main(String[] args) 
	{
		int A[] = {2,4,6,8,10}; 
		
		change(A,2,30); //Array, Index point, New Index Value
		
		for(int x: A)
		{
			System.out.println(x);
		}
		
		int x=10;
		change2(x, 20); 
		System.out.println("Value of primitive data type " + x);
	}
	
	
	static void change(int A[], int index, int value)
	{
		A[index] = value; //the selected index of A is the new value
	}
	
	
	static void change2(int x, int value)
	{
		x=value; 
		/*
		 * This method will take a variable x and new value
		 * and change the value of x
		 */
	}

}
