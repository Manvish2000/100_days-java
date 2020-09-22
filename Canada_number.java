package codes;
import java.util.*;
public class Canada_number 
{
	static int Squares(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int r = n%10;
			sum = sum+(r*r);
			n = n/10;
		}
		return sum;
	}
	static int Divisors(int n)
	{
		int sum = 0;
		for(int i=2 ;i<n ;i++)
		{
			if(n%i==0)
			{
				sum = sum+i;
			}
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int a = Squares(n);
		int b = Divisors(n);
		if(a==b)
			System.out.println("It is a Canada number ");
		else
			System.out.println("It is not a Canada number ");
	}
}
