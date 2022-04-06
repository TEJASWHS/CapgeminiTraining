package com.capg.day3;
import java.util.*;
public class MyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("Enter the a value");
a=sc.nextInt();
System.out.println("Enter the b value");
b=sc.nextInt();
try {
	c=a/b;
	System.out.println(c);
}
catch(Exception e) {
	System.out.println("problem in division");
}
System.out.println("Exiting the main normally");
	}

}
