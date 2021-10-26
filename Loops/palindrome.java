package Loops;
/*
 * reverse a number
 * check id a number is palindrome
 */

import java.util.Scanner;

public class palindrome 
{

	public static void main(String[] args) 
	{ 

		//Reversing a number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a digit"); 
		int number = input.nextInt(); 
		
		int rev = 0; 
		int m = number;
		int r; 
		
		while(number > 0)
		{
			r = number%10; 
			rev = rev*10 + r; 
			number = number/10; 
			
		}
		
		if(rev == m)
		{
			System.out.println("It is a palindrome " + rev);
		}
		else
		{
			System.out.println("It in not a palindreome " + rev);
		}
	}

}
