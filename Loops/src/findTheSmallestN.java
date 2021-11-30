
public class findTheSmallestN 
{

	 public static void main(String[] args)
	 {
		    int n=0;
		     while(true) 
		     {
		        if(n*n*n<12000) 
		        {
		            n++;
		        }
		        else break;
		      }
		     System.out.println(n);
		    }

		}