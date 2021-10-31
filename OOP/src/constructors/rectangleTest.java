package constructors;

public class rectangleTest 
{
	private double length;
	private double width; 
	
	public rectangleTest() //non paramized constructor 
	{
		length = 1; 
		width = 1; 
	}
	
	public rectangleTest(double l, double w)
	{
		setLength(1);
		setWidth(w); 
	}
	
	public double getLength() 
	{
		return length;
	}
	
	public double getWidth() 
	{
		return width;
	}
	
	public void setLength(double l)
	{
		if(l>=0) length=l; 
		else length=0; 
	}

	public void setWidth(double w)
	{
		if(w>=0) width=w; 
		else width=0; 
	}
	public rectangleTest(double s) //s = side
	{
		length = width = s; 
	}	
	
	public double area()
	{
		return getLength() * getWidth(); 
	}
	
	public double perimeter()
	{
		return 2 * (length + width); 
	}
	
	public boolean isSquare()
	{
		if( length == width) return true;
		else return false; 
	}
	
	public class rectangle
	{
		public static void main(String[] args)
		{
			rectangleTest r = new rectangleTest(10, 5); 
			System.out.println("Area " + r.area());
		}
	}

}


