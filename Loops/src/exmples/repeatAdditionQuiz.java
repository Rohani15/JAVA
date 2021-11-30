package exmples;

import java.util.Scanner;

public class repeatAdditionQuiz 
{

	public static void main(String[] args) 
	{
		int num1 = (int)(Math.random() * 10); 
		int num2 = (int)(Math.random() * 10); 
		
		//scanner
		Scanner input = new Scanner(System.in); 
		
		System.out.println("What is " + num1 + "+" + num2 + "?");
		int answer = input.nextInt(); 
		
		while(num1 + num2 != answer) 
		{
			System.out.println("Wrong answer..Try again");
			answer = input.nextInt(); 
		}
		System.out.println("Correct!");

	}

}
