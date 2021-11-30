package exmples;

//You can also use break in a loop to immediately terminate the loop. 

public class testBreak 
{

	public static void main(String[] args) 
	{
		int sum=0; 
		int number=0; 
		
		while(number<20)
		{
			number++; 
			sum += number; 
			if(sum >= 100)
			{
				break; 
			}
		}
		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);
	}

}
