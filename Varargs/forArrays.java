package Varargs;

public class forArrays 
{
	public static void main(String[] args) 
	{
		show(null); 
		show(new int[]{1,2,3,4,5}); 
		show(new int[]{10,9,8,7,6}); 
	}
	
	static void show(int A[])
	{
		for(int x: A)
		{
			System.out.println(x + " ");
		}
	}

}
