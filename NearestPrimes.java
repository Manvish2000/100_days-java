package pack1;
import java.util.*;
public class NearestPrimes
{
	boolean isprime(int n)
	{
		int c = 0;
		for(int i=2; i<n ; i++)
		{
			if(n%i==0)
			{
				c++;
			}	
		}
		if(c==0)
			return true;
		else
			return false;
	}
	int prevprime(int n)
	{
		int c =0;
		while(true)
		{
			if(isprime(n))
				return c;
			else
			{
				n = n-1;
				c++;
			}
		}
	}
	int nextprime(int n)
	{
		int c = 0;
		while(true)
		{
			if(isprime(n))
				return c;
			else
			{
				n=n+1;
				c++;
				
			}
		}
	}
	void nearestprimes()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n =obj.nextInt();
		int m1 = prevprime(n);
		int m2 = nextprime(n);
		if(m1>m2)
		{
			System.out.println("Nearest prime number is ");
			System.out.println(n+m2);
		}
		else if(m2>m1)
		{
			System.out.println("Nearest prime is ");
			System.out.println(n-m1);
		
		}
		else
		{
			System.out.println("Nearest primes are ");
			System.out.println((n-m1)+" "+(n+m2));
			
		}
	}
	public static void main(String args[])
	{
		NearestPrimes obj = new NearestPrimes();
		obj.nearestprimes();
	}

}
