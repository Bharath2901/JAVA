package sumofallnumbers;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) 
	{
		sumofallno();
		
	}
		
    public static void sumofallno()
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int n=scan.nextInt();
	int sum=0;
	
	while(n!=0)
	    {
		int rem=n%10;
		sum=sum+rem;
			n=n/10;
			
		}
		System.out.println(sum);

    }
    
}
	


