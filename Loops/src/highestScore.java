import java.util.Scanner;

public class highestScore 
{

	public static void main(String[] args) 
	{
		 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of students");
		int n = input.nextInt(); 
		int highestscore = 0; 
		String highestscoreName = ""; 
		
		for(int i = 0; i<n; i++)
		{
			System.out.print("Student: " + (i+1) + "\n   Name: ");	
			String name = input.next();
			System.out.println("   Score: ");
			int score = input.nextInt();
			
			if (score > highestscore)
			{
				highestscore = score;
				highestscoreName = name;
			}

		}
		System.out.println("Student with the highest score: " + highestscoreName);


	}

}
