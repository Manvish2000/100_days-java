package codes;
import java.util.*;
public class Happy_number 
{
	static int Happy(int n)
	{
		int r =0, s =0;
		while(n>0)
		{
			r = n%10;
			s = s+(r*r);
			n = n/10;
		}
		return s;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int num =n;
		while(num!=1 && num!=4)
		{
			num = Happy(num);
		}
		if(num==1)
			System.out.println("It is a happy number ");
		else
			System.out.println("It is not a happy number ");
	}
}
	