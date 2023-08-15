package gcdoftownumbers;

import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the two number");
		int m=scan.nextInt();
		int n=scan.nextInt();
		
		int res=GCD.findGCD(m,n);
		System.out.println("the gcd of "+m+" and " +n+ " is "+res);
		

	}

}
