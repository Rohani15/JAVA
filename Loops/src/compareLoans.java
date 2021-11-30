import java.util.Scanner;

public class compareLoans 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Loan Amount: ");
		int loan = input.nextInt(); 
		
		System.out.println("Number of Years: ");
		int years = input.nextInt(); 
		
		 // Printing table header
		 System.out.printf("%-18s%-18s%-18s\n", "Interest Rate",
				 "Monthly Payment", "Total Payment");
		  
		  
		//for each interest rate starting from 5% to 8% with an increment of 1/8
		 double annualInterestRate = 5.0; 
		 
		 while(annualInterestRate <= 8.0)
		 {
			 double monthlyInterestRate = annualInterestRate/1200; 
			 
			 //calculate payment
			 double monthlyPayment = loan * monthlyInterestRate
				     / (1 - 1 / Math.pow(1 + monthlyInterestRate,
				       years * 12));
			 
			 double totalPayment = monthlyPayment * years * 12;

			   // Display results
			   System.out.printf("%-18.3f%-18.2f%-18.2f\n", annualInterestRate,
			     monthlyPayment, totalPayment);
			   
			 annualInterestRate = annualInterestRate + 1.0 / 8;

		 }
	}

}
