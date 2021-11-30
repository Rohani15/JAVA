package exmples;

import java.util.Scanner;

//Generating the program to write 5 questions at a time. 

public class subtractionQuizLoop 
{

	public static void main(String[] args) 
	{
		final int numberOfQuestions = 5; 
		int correctCount = 0; //number of correct answers
		int count = 0; //count the number of questions 
		long startTime = System.currentTimeMillis(); 
		String output = " "; 
		
		Scanner input = new Scanner(System.in); 
		
		while(count < numberOfQuestions)
		{
			//Generate two random single-digit ints
			int number1 = (int)(Math.random() * 10);
			int number2 = (int)(Math.random() * 10);
			
			// 2. If number1 < number2, swap number1 with number2
			if(number1 < number2)
			{
				int temp = number1;
				number1 = number2; 
				number2 = temp; 
			}
			
			//prompt the student to answer "What is number1 - number2?"
			System.out.println("What is " + number1 + " - " + number2 + "? ");
			int answer = input.nextInt();
				
			//Grade the answer and display the results
			if (number1 - number2 == answer) 
			{ 
				System.out.println("You are correct!");
				correctCount++; // Increase the correct answer count
			}
			else
			{
				System.out.println("Your answer is wrong.\n" + number1
				+ " - " + number2 + " should be " + (number1 - number2));
			}
			
			// Increase the question count
			count++;
			
			output += "\n" + number1 + "-" + number2 + "=" + answer + ((number1 - number2 == answer) ? " correct" : " wrong");
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		System.out.println("Correct count is " + correctCount +
				"\nTest time is " + testTime / 1000 + " seconds\n" + output);
		
		
		
		
	}

}
