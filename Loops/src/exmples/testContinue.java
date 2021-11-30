package exmples;
/*You can also use the continue keyword in a loop. When it is encountered, 
 * it ends the cur- rent iteration and program control goes to the 
 * end of the loop body. In other words, continue breaks out of
 *  an iteration while the break keyword breaks out of a loop. 
 *  Listing 5.13 presents a program to demonstrate the effect 
 *  of using continue in a loop.
 */
public class testContinue 
{

	public static void main(String[] args) 
	{
		int sum=0; 
		int number=0; 
		
		while(number<20)
		{
			number++;
			if(number==10 || number==1)
			{
				continue; 
			}
			sum += number; 
		}
		System.out.println("the sum is: " + sum);
	}

}
