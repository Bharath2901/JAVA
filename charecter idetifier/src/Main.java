import java.util.Scanner;

public class Main {
	public static void identifyCharacter(char ch) 
	
	{
		 if(Character.isDigit(ch))
		{
			System.out.println("the char is digit");
			
		}
		 else if(!Character.isLetter(ch))
		 {
			 System.out.println("the char is special charecter");
				
			 
		 }
		 else
		 {
		
		switch(Character.toLowerCase(ch)){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			if(Character.isLowerCase(ch))
			{
				System.out.println("the char "+ch+" is lower case vowel");
			}
			else
			{
				System.out.println("the char "+ch+"is upper case vowel");
			}
				
			break;
			default:
			if(Character.isLowerCase(ch))
			{
				System.out.println("the char "+ch+"is lower case consonent");
			}
			else
			{
				System.out.println("the char "+ch+"is upper case consonent");
			}
			
		}
		}
	}
		

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the charecter");
		char ch=scan.next().charAt(0);
		identifyCharacter(ch); 
		

	}

}
