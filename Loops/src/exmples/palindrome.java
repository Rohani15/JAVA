package exmples;

import java.util.Scanner;

/*A string is a palindrome if it reads the same forward and backward. 
 * The words “mom,” “dad,” and “noon,” for instance,
 *  are all palindromes.
The problem is to write a program that prompts the user to enter a 
string and reports whether the string is a palindrome.
import java.util.Scanner;
 */
public class palindrome 
{
	
	/*
	 * One solution is to check whether the first character in the string 
	 * is the same as the last character. If so, check whether the second 
	 * character is the same as the second-to-last character.
	 * This process continues until a mismatch is found or all the 
	 * characters in the string are checked, except for the middle 
	 * character if the string has an odd number of characters.
	 */

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter a string
		System.out.println("Enter a string: ");
		String s = input.nextLine(); 
		
		//the index of the first character in the string
		int low=0; 
		//the index of the last character in  the string
		int high = s.length()-1; 
		
		
		/*
		 *  Initially, low is 0 and high is 
		 *  s. length() – 1.If the two characters at these positions match,
		 *  increment low by 1 and decrement high by 1.
		 *  This process continues until (low >= high) or a mismatch 
		 *  is found.
		 */
		boolean isPalindrome = true; 
		while(low < high)
		{
			if(s.charAt(low) != s.charAt(high))
			{
				isPalindrome = false; 
				break; 
				 
			}
			
			low++;
			high--;
		}
		
		if(isPalindrome) System.out.println(s + " is a palindrome");
		else System.out.println(s + " is not a palindrome");


	}

}
