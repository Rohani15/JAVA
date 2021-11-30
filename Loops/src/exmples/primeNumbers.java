package exmples;

public class primeNumbers 
{

	public static void main(String[] args) 
	{
		final int numberOfPrimes=50; //# of primes to display
		final int numberOfPrimesPerLine=10; //Display 10 per line
		int count=0; //count # of prime numbers
		int number=2; //A number to be tested for primes
		
		System.out.println("The first 50 prime numbers are \n");
		
		//Repeatedly find prime numbers
		while(count < numberOfPrimes)
		{
			//Assume the number is prime
			boolean isPrime = true; //is the current number prime? 
			
			//test weather number is prime
			for(int divisor = 2; divisor <= number/2; divisor++)
			{
				if(number % divisor ==0)
				{
					isPrime = false; //set isprime to false
					break; //exit the for loop
				}
			}
			
			//display the prime number and increase count
			if(isPrime)
			{
				count++; //increase the count
				
				if(count % numberOfPrimesPerLine == 0)
				{
					//display the number and advance to the new line
					System.out.println(number);
				}
				else
				{
					System.out.println(number + " ");
				}
				
				//check if the number is prime
				number++; 
			}
		}
	}

}
