package codes;
import java.util.*;
public class Chef2
{
	 public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t-->0){
	            int n=sc.nextInt();
	            if(divide(n)) System.out.println("YES");
	            else System.out.println("NO");
	        }
	        
	    }
	    static boolean divide(int n){
	        for(int i=2;i<=n/2;i++){
	            for(int j=i;j<n;j++){
	                if(semi(i) && semi(j) &&i+j==n){
	                    return true;
	                }
	            }
	           
	        }
	        return false;
	    }
	    static boolean semi(int n){
	        int c=0;
	        int temp=n;
	        for(int i=2;i*i<n && c<2;i++){
	            while(n%i==0){
	                n/=i;
	                c++;
	            } 
	        }
	        if(n!=1) c++;
	        if(c==2) return true;;
	        return false;
	    }
}
