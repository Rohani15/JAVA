import java.util.Scanner;

public class factorsOfAnInt 
{
	/*
	 *  Write a program that reads an integer and displays all its smallest factors in increasing order. 
	 *  For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
	 */

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		int index = 2; // Numbers to test as factors 

		while (number / index != 1)
		{
			if(number % index == 0)
			{
				System.out.print(index + ", "); 
				number /= index; 
			}
			else index++; 
		}
		
		
		


	}

}
