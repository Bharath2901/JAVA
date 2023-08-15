package grades;

import java.util.Scanner;

public class Main {
	public static void checkGrade(int grade)
	{
		if(grade<50)
		{
			System.out.println("the student is fail");
			
		}
		else
			
		{
			System.out.println("the student is pass");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the marks");
		int grade=scan.nextInt();
		 checkGrade(grade);
		
		
		

	}

}
