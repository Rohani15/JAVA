package Varargs;

public class sum 
{

	public static void main(String[] args) 
	{
		System.out.println(sum(1,2,3,4,5));
	}
	static int sum(int ...arr)
	{
		int result=0;
		for (int x: arr)
		{
			result += x;
		}
		return result; 
		
	}

}
