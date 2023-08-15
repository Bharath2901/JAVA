package reversethenumber;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		Reverse pali=new Reverse();
		int res=pali.rev(n);
	
	if(n==res)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
		
	}

}
