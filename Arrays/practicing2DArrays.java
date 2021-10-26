package Arrays;

public class practicing2DArrays 
{

	public static void main(String[] args) 
	{
		/*
		int C[][]; 
		C = new int[5][5]; 
		
		int [][] D = new int[5][5]; 
		
		int[] G,H,I, J; 
		
		int[] E,F[]; //Two array where as E is 1D array and F is 2D
		E = new int[5]; 
		F = new int[5][5];
		*/
		
		int A[][] = new int[5][5]; 
		
		int B[][] = {{1,2,3}, {2,4,6}, {1,3,5}};
		
		//nested for loop to display elements of 2D array
		for(int i=0; i<B.length; i++)
		{
			for (int j=0; j<B[0].length; j++)
			{
				System.out.print(B[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("---------------");
		
		//Using for each loop
		for(int x[]: B) //for rows
		{
			for(int y: x) //for elements from x
			{
				System.out.print(y + " ");
			}
			System.out.println("");
		}
		
		
		//Printing directly B

	}
	

}


















