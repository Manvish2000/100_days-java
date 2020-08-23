package pack1;
import java.util.*;
public class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int r;
		int s = 0;
		int temp = n;
		while(n>0)
		{
			r = n%10;
			s = (s*10)+r;
			n = n/10;
		}
		if(temp == s)
		{
			System.out.println("It is a palindrome");
		}
		else
			System.out.println("It is not a palindrome");
	}
}
