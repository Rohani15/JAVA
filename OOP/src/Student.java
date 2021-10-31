
class studentTest
{
	public int roll;
	public String name;
	public String course;
	public int mark1; 
	public int mark2; 
	public int mark3; 
	
	public double total()
	{
		return mark1 + mark2 + mark3;
	}
	
	public double average()
	{
		return (float)total() / 3; 
	}
	
	public char grade() //char, because it is going to return a signle char
	{
		if(grade() >= 60) return 'A'; 
		else return 'B';
	}
	
	public String details()
	{
		return "Roll No:" + roll + "\n" + "Name:" + name + "\n" + course + "\n";
	}

}


public class Student 
{
	public static void main(String[] args) 
	{
		studentTest s = new studentTest(); 
		
		s.roll=1;
		s.name="Rohani";
		s.course="Java";
		s.mark1=99;
		s.mark2=100;
		s.mark3=95; 
		
        System.out.println("Total : " + s.total());
        System.out.println("Average : " + s.average());
        System.out.println("Details:\n " + s.details() );
		
	}

}
