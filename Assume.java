package pack1;
import java.util.*;

public class Assume {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int f = 1;
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(int i = 1; i<=n ; i++)
		{
			f=f*i;
		}
		System.out.println("Factorial of number is : "+f);
	}

}
