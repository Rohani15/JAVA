import java.util.Scanner;

public class compoundValue 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Amount: ");
		double amount = input.nextInt();
		
		System.out.println("Enter Rate: ");
		int rate = input.nextInt();
		
		System.out.println("Enter Number of months: ");
		int months = input.nextInt();
		
		double interestRate = (rate/100) / months; 
		double compoundValue = 0; 
		for(int i=0; i<=months; i++)
			
		{
			compoundValue = (amount + compoundValue) * (1 + interestRate); 
		}
		
		// Display result
		System.out.printf(
			"Amount in savings account after " + 
			months + " months: $%.2f\n", compoundValue);


	}

}
