package methods;

public class indentifyAPrimeNumber 
{

	public static void main(String[] args) 
	{
		System.out.println(isPrime(19));
	}
	
	static boolean isPrime(int value)
	{
		for(int i=2; i<value/2; i++)
		{
			if(value % i == 0)
			{
				return false; 
			}
		}
		return true; 
	}

}
