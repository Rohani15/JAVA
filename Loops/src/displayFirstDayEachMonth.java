import java.util.Scanner;

public class displayFirstDayEachMonth 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: (e.g., 2012): ");
		int year = input.nextInt();	// Holds the year
		System.out.print("Enter first day of the year: ");
		int day = input.nextInt();		// Holds the day

		int month = input.nextInt();
		
		switch (month)
		{
			case 1: 
				System.out.println("January" + year + " is");
                break;
			case 2: 
				System.out.println("Febuary" + year + " is");
			case 3: 
				System.out.println("March" + year + " is");
			case 4: 
				System.out.println("April" + year + " is");
			case 5:
				System.out.println("May" + year + " is");
			case 6: 
				System.out.println("June" + year + " is");
			case 7:
				System.out.println("July" + year + " is");
			case 8:
				System.out.println("August" + year + " is");
			case 9: 
				System.out.println("September" + year + " is");
			case 10:
				System.out.println("October" + year + " is");
			case 11: 
				System.out.println("November"  + year + " is");
			case 12: 
				System.out.println("December" + year + " is");

		}
		

		
		
	}

}
