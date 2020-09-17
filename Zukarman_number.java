package codes;
import java.util.*;
public class Zukarman_number 
{
	static int Product(int n)
	{
		int product=1;
		while(n!=0)
		{
			int r = n%10;
			product = r*product;
			n = n/10;
		}
		return product;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int temp=n;
		int p = Product(n);
		if(temp%p==0)
			System.out.println("It is a Zukarman number ");
		else
			System.out.println("It is not a Zukarman number ");
	}
}
