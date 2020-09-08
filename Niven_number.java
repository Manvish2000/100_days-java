package pack1;
import java.util.*;
public class Niven_number
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int temp =n;
		int r , s=0;
		while(n!=0)
		{
			r = n%10;
			s = s+r;
			n = n/10;
		}
		if(temp%s==0)
			System.out.println("It is a niven number ");
		else
			System.out.println("It is not a niven number ");
	}
}
