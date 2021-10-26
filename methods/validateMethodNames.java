package methods;

public class validateMethodNames 
{

	public static void main(String[] args) 
	{
		//validate(2); 
	}
	
	boolean validate(int age)
	{
		return age >= 3 && age <= 15; 
	}
	
	boolean validate(String name)
	{
        return name.matches("[a-zA-Z\\s]+");
	}

}
