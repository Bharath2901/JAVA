import java.util.Scanner;

public class Main {
	public static void getProduct(String productCode)
	{
		switch(productCode)
		{

		case "p01":System.out.println("fanta");
		break;
		case" p02":System.out.println("cocacola");
		break;
		case "p03":System.out.println("mirinda");
		break;
		case "p04":System.out.println("pepsi");
		break;
		case "p05":System.out.println("monster");
		break;
		case "p06":System.out.println("moutain due");
		
		}
		
	}
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the productcode");
		String productCode=scan.next();
		getProduct(productCode);
		
		
		
		

	}

}
