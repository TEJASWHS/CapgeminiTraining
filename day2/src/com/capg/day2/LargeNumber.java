package com.capg.day2;
import java.util.*;
public class LargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Find largest number in 3 numbers");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st number number");
		int a=sc.nextInt();
		System.out.println("enter 2nd number number");
		int b=sc.nextInt();
	    System.out.println("enter 3rd number number");
	    int c=sc.nextInt();
	
	 if(a>=b && a>=c) 
		 System.out.println("The largest number is "+ a); 
	 
	 else if(b>=a && b>=c)
		 System.out.println("The largest number is "+ b); 
	 else
		 System.out.println("The largest number is "+ c);  
	}
}
