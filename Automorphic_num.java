package pack1;
import java.util.*;
public class Automorphic_num 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int sq = n*n;
		int temp =n;
		int c =0 ,r , s=0 ,s2 =0;
		while(n != 0) 
		{
			c++; 
			n=n/10;
		}
		for(int i =1 ; i<=c ;i++)
		{
			r = sq%10; 
			s = (s*10)+r;
			sq = sq/10;
		}
		while(s!=0)
		{
			int r2 = s%10;
			 s2 = (s2*10)+r2;
			 s = s/10;
		}
		if(temp == s2)
			System.out.println("Automorphic number ");
		else
			System.out.println("Not Automorphic number ");
	}
}