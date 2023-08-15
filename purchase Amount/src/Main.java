import java.util.Scanner;

public class Main {
	public static void checkDiscount(double puchaseAmount)
	{
		if(puchaseAmount >100)
		{
			System.out.println("discount avilable");
		}
		else
		{
			System.out.println("not avilable");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the amount");
		double purchaseAmount=scan.nextDouble();
		checkDiscount(purchaseAmount);
	}
	
	}

