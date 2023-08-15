import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
	
		{
		if(n<2)
		{
			System.out.println("not prime");
		}
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0);
			{
				System.out.println("not prime");
				return;
			}
		}
		System.out.println("prime");
		
		}
		
	}

}
