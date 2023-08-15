import java.util.Scanner;

public class Main {
	public static void checkMultipleOfTen(int n,int m) 
	{
		if(n%m==0)
		{
			System.out.println("multiple of m");
			
		}
		else
		{
			System.out.println("not multiple of m");
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number n");
		int n=scan.nextInt();
		System.out.println("enter the number m");
		
		int m=scan.nextInt();
		 checkMultipleOfTen(n,m);

	}


}
