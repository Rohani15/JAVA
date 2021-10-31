package constructors;

public class Cylinder 
{
	private double radius; 
	private double height; 
	
	public Cylinder()
	{
		radius=1;
		height=1; 
	}
	public Cylinder(double r, double h)
	{
		setRadius(r); 
	}

	public double getRadius() 
	{
		return radius;
	}
	
	public double getHeight() 
	{
		return height;
	}

	public void setRadius(double r) 
	{
		if(radius<0) radius=r; 
		else radius=0; 
	}
	
	public void setHeight(double h) 
	{
		if(height<0) height=h;
		else height=0; 
	}


	//public double setDimensions(int r, int h)
	{
		
	}


	/*-------------------------------------------------*/
	public class test
	{
		public static void main(String[] args)
		{
			Cylinder c = new Cylinder(); 
		}
	}
}


