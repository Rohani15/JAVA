package Loops;

import java.util.Scanner;

public class displayTheNumberInWords 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = input.nextInt(); 
		int r; 
		String Str = ""; //initialize the string

		while(n>0)
		{
			//Reversing a number using String
			r=n%10; //
			n=n/10;
			Str=Str+r; 
		}
		System.out.println(Str);
		
		char c; 
		for(int i=Str.length()-1; i>0; i--) //reversing loop
		{
			c=Str.charAt(i); 
			switch(c)
			{
			case '0': System.out.println("Zero"); break; 
			case '1': System.out.println("One"); break; 
			case '2': System.out.println("Two"); break; 
			case '3': System.out.println("Three"); break; 
			case '4': System.out.println("Four"); break; 
			case '5': System.out.println("Five"); break; 
			case '6': System.out.println("Six"); break; 
			case '7': System.out.println("Seven"); break; 
			case '8': System.out.println("Eight"); break; 
			case '9': System.out.println("Nine"); break; 

			}
		}
	}

}
