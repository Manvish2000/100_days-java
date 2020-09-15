package codes;
import java.util.*;
public class Smith_number 
{
	static int Sum(int n)
	{
		int s=0;
		while(n>0)
		{
			int r = n%10;
			s = s+r;
			n = n/10;
		}
	return s;
	}
	static int SumPrime(int n)
	{
		int i =2 , sum =0;
		while(n>0)
		{
			if(n%i==0)
			{
				sum = sum+Sum(i);
				n = n/i;
			}
			else
				i++;
		}
		return sum;
	}
	static boolean Composite(int n)
	{
		int c =0;
		for(int i = 1; i<n ;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c>2)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		if(Composite(n)==false)
			System.out.println("It is not a composite number ");
		else
			System.out.println("Enter the composite number ");
		int a = Sum(n);
		int b = SumPrime(n);
		if(a==b)
			System.out.println("Smith number ");
		else
			System.out.println("Not Smith number");
		}
}
	