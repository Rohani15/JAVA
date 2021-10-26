package arraysAgain;

public class insertAnElement 
{

	public static void main(String[] args) 
	{
		int A[] = {2,4,3,6,7,9,8,1}; 
		//inserting is possible only if there are free space in the array
		int index = 3; //index A[2]
		int y=20; //the new element
		for(int i=2; i>index; i--) //Start at index 2, i is > than index A[2], and go backwards
		{
			A[i] = A[i-1]; 
		}
		A[index] = y; //A[20] = element 20
		
		for(int x:A)
		{
			System.out.print(x + ", ");
		}

	}

}
