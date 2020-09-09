package pack1;
import java.util.*;
public class Neon_number 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int sq = n*n;
		int s= 0, r;
		while(sq != 0)
		{
			r = sq%10;
			s = s+r;
			sq = sq/10;
			
		}
		if(s == n)
			System.out.println("It is a neon number ");
		else
			System.out.println("It is not a neon number ");
	
	}
			
}
