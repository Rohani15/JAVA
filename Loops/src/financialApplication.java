
public class financialApplication 
{

	public static void main(String[] args) 
	{
		int tuition = 10_000; 
		
		for(int i=1; i<=14; i++)
		{
			tuition += (tuition * .05); //You has trouble on this spot
			
			System.out.println("in year " + i + " the tuition is " + tuition);
			
			if(i == 14)
			{
				int total = tuition; 
				System.out.println("total is: " + total);

			}
		}
	}

}
