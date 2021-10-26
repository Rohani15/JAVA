package Loops;

import java.util.Scanner;

/*
 * Display digits
 * count digits of a number
 * find a number is in Armstrong/not
 * reverse a number
 * check idk a number is palindrome
 */
public class armstrongNumber 
{

	public static void main(String[] args) 
	{
		//can't use for loop because we don't know the number of times it will repeat
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a digit"); 
		int number = input.nextInt(); 
		int count = 0; //Remember to initialize count
		
		//This loop is isolating each digit from the number
		while(number > 0) //stop when number = 0. 
		{
			int remainder = number % 10; //ex, 257 % 10 = 7. **Make sure the remainder line is above the number line. 
			number = number/10; //Ex, 257/10 = 25. 
			count++; //this counts the number of digits from the line above
			System.out.println("The number is " + number + " " + "The remainder is " + remainder);	
			
		}
		
		System.out.println("The total digits are: " + count); 
		
		
		while(number > 0)
		{
			number = number/10; 
			System.out.println(number);
		}

		
		
	}

}
