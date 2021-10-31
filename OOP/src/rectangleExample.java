

	class Rectangle
	{
		private double width;
		private  double length; 
		
		
		
		public double getWidth() 
		{
			return width;
		}

		public void setWidth(double width) 
		{
			this.width = width;
		}

		public double getLength() 
		{
			return length;
		}

		public void setLength(double length) 
		{
			//if(length>=0) 
			this.length = length;
		}

		
		public double area()
		{
			return width * length; 
		}
		
		public double perimeter()
		{
			return 2 * (length + width); 
		}
		
		public boolean isSquare()
		{
			if(length == width) return true; 
			else return false; 
		}

	}
	
	public class rectangleExample 
	{

	    public static void main(String[] args) 
	    {
	        Rectangle r = new Rectangle();
	        //r.length=10.5;
	        //r.length=5.5;
	        
	        r.setLength(10.5);
	        r.setWidth(5.5);
	        
	        System.out.println("Length: " + r.getLength());
	        System.out.println("Width: " + r.getWidth());

	        
	        System.out.println();
	        System.out.println("Area " + r.area());
	        System.out.println("perimeter " + r.perimeter());
	        
	        System.out.println("Is it a Square?: " + r.isSquare());
	    }
	    
	}
