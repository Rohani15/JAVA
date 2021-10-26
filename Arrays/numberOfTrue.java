package Arrays;

import java.util.stream.IntStream;


public class numberOfTrue
{

	public static void main(String[] args) 
	{
		boolean A[] = {false, false, false}; //2
		System.out.println(countTrue(A));
	}
	
	public static int countTrue(boolean[] A)
	{
		int count=0; 
		for(int i=0; i<=4; i++)
		{
			if(A[i] == true)
			{
				count++; 
			}
			else
			{
				return 0; 
			}
		}
		return count; 
	}

	/*
	public static int countTrue2(boolean[] a) 
	{
		int count = 0;
		for(int i=0;i<arr.length;i++) if(arr[i]) count++;
		return count;
	}
	*/

}
