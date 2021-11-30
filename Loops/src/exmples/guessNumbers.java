package exmples;

import java.util.Scanner;

/*
Guess a magic number between 0 and 100
Enter your guess: 50
Your guess is too high
Enter your guess: 25
Your guess is too low
Enter your guess: 42
Your guess is too high
Enter your guess: 39
Yes, the number is 39
 */

public class guessNumbers 
{

	public static void main(String[] args) 
	{
		int number = (int)Math.random() *101; 
		
		System.out.println("Guess A number betweek 0-100:");
		Scanner input = new Scanner(System.in);
		
		int guess = -1; 
		while(guess != number)
		{
			System.out.print("\nEnter your guess: ");
			guess = input.nextInt();
			
			if(guess == number) System.out.println("Correct " + number);
			else if(guess > number) System.out.println("Too high");
			else System.out.println("To low");
		}
	}

}








