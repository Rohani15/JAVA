
public class kilogramToPounds 
{

	public static void main(String[] args) 
	{
		int kilo=0; 
		double pounds=2.2; 
		
		for(int i=1; i<=199; i+=2)
		{	
			double poundTotal = i * pounds; 
			System.out.println(i + " kilo is " + Math.round(poundTotal) + " pounds");

		}
	}

}
