package codes;
import java.util.*;
public class Karprekar_number 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int c = 0,fp =0,sp = 0, s =0 ;
		int sq = n*n;
		int temp =sq;
		while(temp != 0)
		{
			c++;
			temp = temp/10;
		}
		for(int i = c-1 ; i>0 ; i--)
		{
			fp = sq / (int)Math.pow(10, i);
			sp = sq%(int)Math.pow(10, i);
			if(fp==0 ||sp==0)
				continue;
			s = fp+sp;
			if(s==n)
			{
				System.out.println("It is a karprekar number ");
				break;
			}
		}
		if(s!=n)
			System.out.println("It is not a Karprekar number");
	}
}
