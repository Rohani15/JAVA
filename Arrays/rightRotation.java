package Arrays;

public class rightRotation 
{

	 public static void main(String[] args) 
	 {
         int A[] = {3,9,7,8,12,6,15,5,4,10};
         
         for (int x: A) 
         {
                 System.out.print(x + ", ");
         }
         System.out.println("\n-----------");
         
    	 
         
         int last = A[A.length-1]; //This is index 9: Element 10
    	 int size = A.length; 
         
    	 for(int i=size-1; i>0; i--) //Starting with the index 9
         {
        	 A[i] = A[i-1]; //10 will be replaced with 4. == {3,9,7,8,12,6,15,5,4,4}
         }
    	 A[0] = last; //10 is moved to index one 
         
         
    	 
    	 for (int x: A) 
         {
                 System.out.print(x + ", ");
         }
 }
}