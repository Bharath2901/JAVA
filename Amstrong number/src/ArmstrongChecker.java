
public class ArmstrongChecker {
	public int checker(int n)
	{
		int count=0;
		int arm=0;
		int org=n;
	
		while(n!=0)
		{
			int d=n%10;
			n=n/10;
			count++;
		}
	n=org;
	while(n!=0)
	{
		int d=n%10;
		arm+=(int)Math.pow(d,count);
		n=n/10;
		
	}
	return arm;
	
		
	}

}
