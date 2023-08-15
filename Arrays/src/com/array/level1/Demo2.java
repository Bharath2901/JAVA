package com.array.level1;

import java.util.Scanner;

public class Demo2 {

	
		public static void main(String[] args) {
		    Scanner scan=new Scanner(System.in);
		    System.out.println("enter the array size");
		    int arr[]=new int[scan.nextInt()];
		    for(int i=0;i<=arr.length-1;i++)
		    {
		    	arr[i]=scan.nextInt();
		    	
		    }
		    System.out.println("array of contents");
		    for (int i : arr) {
		    	System.out.println(i+5+" ");
				
			}
			


	}

}
