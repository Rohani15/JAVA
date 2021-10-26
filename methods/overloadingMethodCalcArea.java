package methods;

public class overloadingMethodCalcArea 
{

	public static void main(String[] args) 
	{
		System.out.println(area(4,6));
		
		System.out.println(area(4));

	}
	
	static double area(double l, double h)
	{
		return l * h; 

		
	}
	
	static double area(double r)
	{
		return Math.PI * (r*r); 
	}
	
	

}
