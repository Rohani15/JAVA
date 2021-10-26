package Varargs;

public class methodPractice 
{

	public static void main(String[] args) 
	{
		/*
		show();
		show(10,20,30);
		show(new int[] {3,5,7,8,9}); //can even pass array obj
		show(new int[] {10,20,30}); //can even pass array obj
		*/
		
		showList(5, "A", "b", "c", "d"); //the 5 is initializing start to 5; 

	}
	
	static void show(int ...A)
	{
	}
	
	
	
	static void showList(int start, String ...S) //Start is to give different index starting 
	{
		for (int i=0; i<S.length; i++)
		{
			System.out.println(start + ". " + S[i]); //+1 so it starts on 1 and not 0
			start++; 
		}
	}

}
