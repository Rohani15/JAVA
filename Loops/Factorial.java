package Loops;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		
		  Scanner input = new Scanner(System.in); 
		  System.out.println("Enter a number");
		  
		  int n=5; 
		  for(int i=1; i<=10; i++) 
		  { 
			  System.out.println(n + " x " + i + " = " + n * i);
		  }
		 
		
		int factorial = 1; 
		for(int i=1; i<=5; i++)
		{
			factorial = factorial * i; 
			System.out.println("The factorial of turn " + i + " is " + factorial);
			
		}
	}

}
