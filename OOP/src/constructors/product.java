package constructors;

public class product 
{
	private String itemno; 
	private String name; 
	private double price; 
	private int quanityt;
	
	public product(String itemno)
	{
		itemno=itemno; 
	}
	
	public product(String itemno, String name)
	{
		itemno=itemno; 
		this.name=name; 
	}
	
	public product(String itemno, String name, double price, int quanityt) 
	{
		super();
		this.itemno = itemno;
		this.name = name;
		this.price = price;
		this.quanityt = quanityt;
	}


	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setQuanityt(int quanityt) 
	{
		this.quanityt = quanityt;
	} 
	
	
	public String getItemno() { return itemno; } //item numeber never changes
	public String getName() { return name; }
	public int getQuanityt() { return quanityt; }
	public double getPrice() { return price; }

}
