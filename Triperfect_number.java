package codes;
import java.util.*;
public class Triperfect_number 
{
	static int Divisor(int n)
	{
		int sum =0;
		for(int i = 1 ; i<=n ; i++)
		{
			if(n%i==0)
			{
				int r = n/i;
				sum = sum+r;
			}
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int t=3*n;
		int m=Divisor(n);
		if(t==m)
			System.out.println("It is a tri perfect number ");
		else
			System.out.println("It is not a tri perfect number ");
	}
}
