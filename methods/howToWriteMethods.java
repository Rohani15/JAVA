package methods;

public class howToWriteMethods 
{
	public static void main(String[] args) 
	{
		int a=10, b=15; 
		//System.out.println(max(a, b));
		
		howToWriteMethods m = new howToWriteMethods(); //Creating a new object
		System.out.println(m.max(a, b));
		
		inc(a); 
	}
	
	static void inc(int x)
	{
		x++; 
		System.out.println(x);
	}
	
	int max(int x, int y)
	{		
		if(x > y)
		{
			return x;
		}
		else
		{
			return y; 
		}
	}

}
