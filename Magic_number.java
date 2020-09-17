package codes;
import java.util.*;
public class Magic_number 
{
	static int Sum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int r = n%10;
			sum = sum+r;
			n = n/10;
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int s = Sum(n);
		int s2=0;
		while(s!=0)
		{
			int r = s%10;
			s2+=r;
			s/=10;
		}
		if(s2==1)
			System.out.println("It is a magic number ");
		else
			System.out.println("It is not a magic number ");
	}
}	