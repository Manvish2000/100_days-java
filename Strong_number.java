package pack1;
import java.util.*;
public class Strong_number
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int s=0 , r ,temp =n;
		while(n!=0) //145
		{
			r = n%10;
			int f = 1;
			for(int i =1 ; i<=r ;i++)
			{
				f = f*i;
			}
			s= s+f;
			n=n/10; //14
		}
		if(s == temp)
			System.out.println("It is a strong number");
		else
			System.out.println("It is not a strong number");
	}
}
