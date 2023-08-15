import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the n value");
		int n=scan.nextInt();
		ArmstrongChecker check=new ArmstrongChecker();
		int arm=check.checker(n);
		if(n==arm)
		{
		System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
			
		}
		

	}

}
