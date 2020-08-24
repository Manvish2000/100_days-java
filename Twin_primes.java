package pack1;
import java.util.*;
public class Twin_primes
{	
	static boolean isPrime(int n)
	{
		boolean f = true ;
		int c = 0;
		for(int i = 1 ;  i<=n ; i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c>2)
		{
			f=false ;
		}
		return f;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1 ");
		int n1 = sc.nextInt();
		System.out.println("Enter the number 2 ");
		int n2 = sc.nextInt();
		if(isPrime(n1)==true&&isPrime(n2)==true&&(n2-n1)==2)
			System.out.println("They are twin primes");
		else
			System.out.println("They are not twin primes ");
			
		
	}
	
}

