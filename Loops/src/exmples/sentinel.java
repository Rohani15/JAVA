package exmples;

import java.util.Scanner;

//Sentinel value is a special value in the context of an algorithm which uses its presence as a condition of termination,
public class sentinel 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter a int ==> The input ends if it is a 0");
		int data = input.nextInt(); 
		
		//keep reading the data until the input is 0
		int sum=0; 
		while(data != 0)
		{
			sum+=data; 
			
			//read the next data
			System.out.println("Enter an int ==> The input ends if its 0");
			data = input.nextInt(); 

		}
		System.out.println("the sum is " + sum);
		

	}

}
