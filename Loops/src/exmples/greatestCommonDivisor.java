package exmples;

import java.util.Scanner;

public class greatestCommonDivisor 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter 2 integers
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt(); 
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt(); 
		
		int gcd=1; 
		int k=2; 
		
		while(k <= n1 && k<=n2) //check if k is a common divisor for n1 and n2, until k1 is greater than n1 or n2, store the gcd in a variable called gcd
		{
			if(n1 % k ==0 && n2 % k == 0)
			{
				gcd=k; //update gcd Whenever a new common divisor is found, gcd becomes the new gcd
 			}
			k++; 
		}
		System.out.println("The greatest common divisor for " + n1 + 
				" and " + n2 + " is " + gcd);


	}

}
