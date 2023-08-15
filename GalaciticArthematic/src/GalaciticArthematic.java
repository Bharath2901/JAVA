import java.util.Scanner;

public class GalaciticArthematic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		long result=galaciticAddtion(num1, num2);
		System.out.println(result);
		

	}
public static long galaciticAddtion(long num1,long num2)
{
	return num1+num2;
}
}
