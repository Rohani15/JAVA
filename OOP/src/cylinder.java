
class cylinderTest
{
	public double radius;
	public double height; 
	
	public double lidArea()
	{
		return (2 * Math.PI * radius * height) + (2 * Math.PI * (radius * radius)); 
	}
	
	public double totalSurfaceArea()
	{
		return lidArea(); 
	}
	
	public double volume()
	{
		return Math.PI * (radius * radius) * height; 
	}
	
	public double circumference()
	{
		return 2 * Math.PI * radius; 
	}

}

public class cylinder
{
	public static void main(String[] args) 
	{
		
		cylinderTest c1 = new cylinderTest(); 
		c1.radius = 7; 
		c1.height = 10; 
		
		System.out.println("Lid Area is: " + c1.lidArea());
		System.out.println("Total Surface Area is: " + c1.totalSurfaceArea());
		System.out.println("volume is: " + c1.volume());
		System.out.println("circumference is: " + c1.circumference());

	}

}
