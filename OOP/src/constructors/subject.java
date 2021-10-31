package constructors;

public class subject 
{
	private String subID;
	private String name; 
	private double maxMarks; 
	private double marksObtain;
	
	
	
	public subject(String subID)
	{
		this.subID = subID;
	}

	public subject(String subID, String name) 
	{
		this.subID = subID;
		this.name = name;
	}

	public subject(String subID, String name, double maxMarks)
	{
		this.subID = subID;
		this.name = name;
		this.maxMarks = maxMarks;
	}
	
	public void setMaxMarks(double mm) 
	{
		this.maxMarks = mm;
	}
	public void setMarksObtain(double m) 
	{
		this.marksObtain = m;
	}
	
	boolean isQualified()
	{
		return marksObtain >= maxMarks/10*4; 
	}
	
    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtain;
    }
	
	public String getSubID() { return subID; } 
	public String getName() { return name; }
	public double getMaxMarks() { return maxMarks; }
	public double getMarksObtain() { return marksObtain; } 
	
	public class test 
	{

	    public static void main(String[] args) 
	    {
	    	subject subs[] = new subject[3]; 
	        subs[0]=new subject("s101","DS",100);
	        subs[1]=new subject("s102","Algorithms",100);
	        subs[2]=new subject("s103","Operating Systems",100);
	        
	        for(subject s:subs)
	            System.out.println(s);
	    }
	}
	
	
	
}















