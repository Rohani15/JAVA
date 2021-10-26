package Arrays;

public class increasingSizeOfArray 
{

	public static void main(String[] args) 
	{
        int A[]={8,6,10,9,2};
        int B[] = new int[10]; 
        
        for (int i=0; i<A.length; i++)
        {
        	B[i] = A[i]; 
        }
        B=A; 
        System.out.println("Length of A="+A.length);

        
        for(int x: B)
        {
        	System.out.print(x + ", ");
        }

	}

}
