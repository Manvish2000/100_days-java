package pack1;
import java.util.*;
public class SemiPrime 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int x = n;
		int c = 0;
		for(int i =2 ; c<2 && i*i<=n ; i++)
		{
			while(n%i==0)
			{
				n=n/i;
				++c;
			}
			
		}
		if(n>1)
		{
			++c;
		}
		if(c==2)
		{
			System.out.println("Given number is a semiprime "+x);
		}
		else
		{
			System.out.println("Given number is not a semiprime "+x);
		}
	}	

}
