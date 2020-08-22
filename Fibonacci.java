package pack1;
import java.util.*;
public class Fibonacci 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int n= sc.nextInt();
		int s = 0;
		int t1=0 , t2=1;
		System.out.print(0+ " ");
		System.out.print(1+ " ");
		for(int i=1 ; i<=n ; i++)
		{
			s=t1+t2;
			t1=t2;
			t2=s;
			System.out.print(s+" ");
		}
	}

}
