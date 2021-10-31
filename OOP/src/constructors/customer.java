package constructors;

public class customer 
{
	private String custid; //doesnt change
	private String name; //doesnt change
	private String address;
	private String phno;
	
	
	
	public customer(String custid, String name) //these 2 values are a must
	{
		//super();
		this.custid = custid;
		this.name = name;
	}

	public customer(String custid, String name, String address, String phno) 
	{
		//super();
		this.custid = custid;
		this.name = name;
		this.address = address;
		this.phno = phno;
	}
	

	//these methods change so we created set methoda
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public void setPhno(String phno)
	{
		this.phno = phno;
	}
	
	
	public String getCustid() { return custid; }
	public String getName() { return name; }
	public String getAddress() { return address; }
	public String getPhno() { return phno; } 
	
	

}
