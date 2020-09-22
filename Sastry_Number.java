package codes;
import java.util.*;
public class Sastry_Number 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n =sc.nextInt();
		int n1 = n+1;
		int count=(int)(Math.log10(n))+1;
		int power=(int)(Math.pow(10,count));
		int n2 = (n*power)+n1;
		double perfect = (double)(Math.sqrt(n2));
		double flr = (double)(perfect-Math.floor(perfect));
		if(flr==0)
			System.out.println("It is a Sastry number ");
		else
			System.out.println("It is not a Sastry number ");		
	}
}
