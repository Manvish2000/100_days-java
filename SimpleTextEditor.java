package hackerrank;

import java.io.*;
import java.util.*;

public class SimpleTextEditor{

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Stack<String> st=new Stack<>();
        String s="";
        st.push(s);
        int t=sc.nextInt();
        while(t-->0){
            int c=sc.nextInt();
            
            switch(c){
                case 1:
                   
                    String w=sc.next();
                  
                    s= append(s,w,st);
                    
                    break;
                case 2:
                    int r=sc.nextInt();
                    s=delete(s,r,st);
                    break;
                case 3:
                    int k=sc.nextInt();
                    print(s,k);
                    break;
                case 4:
                    s=undo(st);
                    break;
            }
        }
    }
    static String append(String s,String w,Stack<String> st){
        s=s.concat(w);
        st.push(s);
        return s;
    }
    static String delete(String s,int r,Stack<String> st){
        s=s.substring(0,s.length()-r);
        st.push(s);
        return s;
    }
    static void print(String s,int k){
        System.out.println(s.charAt(k-1));
    }
    static String undo(Stack<String> st){
        st.pop();
        return st.peek();
    }
}
