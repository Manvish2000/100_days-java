package pack1;
import java.util.*;
public class Adam_num
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int square = n*n;
		int r , s=0 , s2 =0, r2;
		while(n != 0)
		{
			r = n%10;
			s = s*10+r;
			n = n/10;
		}
		int square2 = s*s;
		while(square2!= 0)
		{
			r2 = square2%10;
			s2 = s2*10 +r2;
			square2 = square2/10;
		}
		if(square==s2)
			System.out.println("It is Adam number ");
		else
			System.out.println("It is not Adam number ");
	}
}
