
public class Divisible {
	void divisibleby2(int n)
	{
		for(int i=1;i<n;i++)
		{
		if (n%2==0)
		{
			System.out.println("numbers divisible by 2 are "+n);
		}
		}
	}
	void divisibleby3(int n)
	{
		for(int i=1;i<n;i++)
		{
		if (n%3==0)
		{
			System.out.println("numbers divisible by 3 are "+n);
		}
		}
	}
	void divisibleby5(int n)
	{
		for(int i=1;i<n;i++) {
		if (n%5==0)
		{
			System.out.println("numbers divisible by 5 are "+n);
		}
		}
	
	}
	void divisibleby2and5(int n)
	{
		for(int i=1;i<n;i++)
		{
		
		if (n%2==0 && n%5==0)
		{
			System.out.println("numbers divisible by 2 and 5 are "+n);
		}
		}
	}
	void divisibleby3andcomesin5(int n)
	{
		for(int i=1;i<n;i++)
		{
		if (n%3==0 && n%5==0)
		{
			System.out.println("numbers divisible by 3and 5 are "+n);
		}
		}
	}
	void primenumber(int n)
	{
		for(int i=1;i<n;i++)
		{
		if (n%i==0)
		{
			System.out.println("numbers divisible by 2 are "+n);
		}
		}
	}
	void evenumber(int n)
	{
		for(int i=1;i<n;i++)
		{
		if (n%i==0)
		{
			System.out.println("numbers divisible by 2 are "+n);
		}
		}
	}


}
