package pack1;
import java.util.*;
public class Circular_Prime 
{
	static boolean isPrime(int n)
	{	
		int c =0;
		boolean f = true;
		for(int i =1 ; i<=n ;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c>2)
		{
			f = false;
		}
	return f;	
	
	}
	static boolean circular(int n)
	{
		int c = 0;
		int t = n;
		while(t>0)
		{
			c++;
			t=t/10;
		}
		int num = n;
		while(isPrime(num))
		{
			int r = num%10;
			int d = num/10;
			num = (int)((Math.pow(10,c-1 ))*r)+d;
			if(num==n)
				return true;
		}	
	     return false;
		}
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number ");
			int n = sc.nextInt();
			if(circular(n))
				System.out.println("Circular prime ");
			else
				System.out.println("Not circular prime");
		}
	}
