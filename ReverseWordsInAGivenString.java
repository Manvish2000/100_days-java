package geeksforgeeks;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class ReverseWordsInAGivenString {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    sc.nextLine();
	    while(t--!=0){
	        String s=sc.nextLine();
	        String a="";
	        int i=s.length()-1;
	        
	        while(i>=0){
	            while(i>=0 && s.charAt(i)=='.') i--;
	           int j=i;
	            while(i>=0 && s.charAt(i)!='.') i--;
	            if(a.isEmpty())
	                a=a+s.substring(i+1,j+1);
	            else a=a+"."+s.substring(i+1,j+1);
	        }
	        System.out.println(a);
	    }
	}
}
