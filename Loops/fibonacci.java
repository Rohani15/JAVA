package Loops;

import java.util.Scanner;

public class fibonacci 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: "); 
		int n = input.nextInt(); 
//		System.out.println("Enter a: "); 
//		int a = input.nextInt(); 
//		System.out.println("Enter d: "); 
//		int d = input.nextInt(); //common ratio for GP Series
		

		//AP Series
//		for(int i=a; i <=n; i+=d)
//		{
//			System.out.println(i + "");
//		}
		
//		int term = a; 
//		for(int i=0; i<n; i++)
//		{
//			System.out.println(term + " , ");
//			term = term+d; 
//		}
		
		//GP series
//		int term = a; 
//		for(int i=0; i<=n; i++)
//		{
//			term = term * d;
//			System.out.println(term);
//		}
		
		int firstVal = 0, secondVal = 1, thirdVal; 
		System.out.println(firstVal + " " + secondVal);
		
		for(int i=0; i < n-2; i++) //n-2 terms because it has already printed out the first 2 terms.
		{
			thirdVal = firstVal + secondVal; 
			System.out.println(thirdVal + ",");
			firstVal = secondVal; 
			secondVal = thirdVal; 
			
			
		}
	}

}
































