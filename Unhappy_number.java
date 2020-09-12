package codes;
import java.util.*;
public class Unhappy_number 
{
	static int count(int n)
	{
		int length = 0;
		while(n!=0)
		{
			length++;
			n = n/10;
		}
		return length;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int l = count(n);
		int num = n;
		int s =0;
		while(n!=0)
		{
			int r = n%10;
			s = s+((int)Math.pow(r,l));
			l--;
			n = n/10;
		}
		if(num==s)
			System.out.println("It is unhappy number ");
		else
			System.out.println("It is not an unhappy number ");
			
	}
}
