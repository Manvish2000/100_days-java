package pack1;
import java.util.*;
public class Pronic
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number  ");
		int n = sc.nextInt();
		int x =0;
		for(int i = 0; i<=n ; i++)
		{
			if(i*(i+1)==n)
			{
				x = 1;
				break;
			}
		}
		if(x == 1)
			System.out.println("Pronic number ");
		else
			System.out.println("Not pronic number ");
	}
}