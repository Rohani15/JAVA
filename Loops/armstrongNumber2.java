package Loops;

import java.util.Scanner;

public class armstrongNumber2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a digit"); 
		int number = input.nextInt(); 
		int sum = 0; //Sum is initialized to 0
		int m = number; //m equals the final number in the sum=sum+r^3 loop
		
		while(number > 0)
		{
			int r = number % 10; //ex, 257 % 10 = 7. **Make sure the remainder line is above the number line. 
			number = number/10; 
			sum = sum + (r*r*r); 
			
			System.out.println(sum);		
		}
		
		if(sum == m)
		{
			System.out.println("The number is a armstrong number: ");
		}
		else
		{
			System.out.println("It is not an Armstrong Number: ");
		}
	}

}
