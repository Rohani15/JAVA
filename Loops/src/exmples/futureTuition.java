package exmples;

/*Suppose that the tuition for a university is $10,000 this year 
 *and tuition increases 7% every year. In how many years 
 *will the tuition be doubled?
 */

public class futureTuition 
{

	public static void main(String[] args) 
	{
		double tuition = 10_000; 
		int year = 0; 
		
		while(tuition <20_000)
		{
			tuition *= 1.07; 
			year++; 
		}
		
		System.out.println("Tuition will be doubled in " + year + " years");
		System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
	}

}
