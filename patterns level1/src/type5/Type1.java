package type5;

import java.util.Scanner;

public class Type1 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the n value ");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((j==1)||(j==n)||(i==1)||(i==n))
				{
					System.out.print("*");
			    }
				else
				{
					System.out.print(" ");
				
				}
			}
			System.out.println();
		}
	}
}
			
		 	


	
