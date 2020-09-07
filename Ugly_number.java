package pack1;
import java.util.*;
public class Ugly_number
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		if(n%2==0 || n%3 == 0 || n%3==0)
			System.out.println("It is ugly number ");
		else
			System.out.println("It is not ugly number ");
	}
}
