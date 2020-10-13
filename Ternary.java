package ternary;

public class Ternary {

	public static void main(String[] args) {
		int a=1,b=2,c=3;
		int result=(a>b)?(a>c)?a:c:(b>c)?b:c;
		System.out.println(result);
	}

}
