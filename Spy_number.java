package pack1;
import java.util.*;
public class Spy_number
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int s=0 , m=1 , r;
		while(n!=0)
		{
			r = n%10;
			s = s+r;
			m = m*r;
			n = n/10;
		}
		if(s==m)
			System.out.println("It is a Spy number");
		else
			System.out.println("It is not a Spy number ");
	}
}
