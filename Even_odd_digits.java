package pack1;
import java.util.*;
public class Even_odd_digits
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int r, c1 =0, c2 =0;
		while(n!=0)
		{
			r = n%10;
			if(r%2==0)
			c1++;
			else
			c2++;
			n=n/10;
			
		}
		if(c1==0)
			System.out.println("All the digits are odd");
		else if(c2 ==0)
			System.out.println("All the digits are even");
		else
			System.out.println("It is a mixed number");

	}

}
