package methods;

public class findGCD 
{

	public static void main(String[] args) 
	{
		System.out.println(gcd(25,15));
	}
	
	static int gcd(int one, int two)
	{
		while(one != two)
		{
			if(one>two)
			{
				one=one-two; 
			}
			else
			{
				two=two-one; 
			}
		}
		return one; //both are equal so can return one or two
	}

}
 