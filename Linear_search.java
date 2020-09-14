package codes;
import java.util.*;
public class Linear_search
{
	public static void main(String args[])
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int n = sc.nextInt();
		System.out.println("Enter the elements ");
		int[] a = new int[n];
		for( i = 0; i<n ; i++)
			a[i]= sc.nextInt();
		System.out.println("Enter the element to be searched ");
		int search = sc.nextInt();
		for( i =0 ; i<n ;i++)
		{
			if(a[i]==search)
			{
				System.out.println("Element is found ");
				break;
			}
		}
		if(i==n)
			System.out.println("Element is not found ");
	}
}
