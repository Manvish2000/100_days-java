package pack1;
import java.util.*;
public class Reverse 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int r ; 
		int s=0;
		while(n>0)
		{
			r = n%10; //12345
			s = (s*10)+r;
			n = n/10;
		}
		System.out.println("Reverse of number is "+s);
	}
}
