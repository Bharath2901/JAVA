package reversethenumber;

import java.util.Scanner;

public class Reverse {
	public int rev(int n)
	{
	
	int sum=0;
			
	while(n!=0)
	{
		int rem=n%10;
		sum=sum*10+rem;
		n=n/10;
	}
	return sum;
	
	}
}
	


