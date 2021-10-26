package Varargs;

public class practice 
{

	public static void main(String[] args) 
	{
		show(3,6,7,4,3); 
		show(new int[]{1,2,3,4,5,6}); 
	}
	
	static void show(int ...A)
	{
		for(int x: A)
		{
			System.out.println(x + " ");
		}
	}

}
