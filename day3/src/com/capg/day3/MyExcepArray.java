package com.capg.day3;
import java.util.*;
public class MyExcepArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a[]=new  int[5];
for(int i=0;i<=a.length-1;i++) {
	System.out.println("Enter the element");
	a[i]=sc.nextInt();
}
try {
	for(int i=0;i<=10;i++) {
		System.out.println(a[i]);
	}
}
catch(Exception e) {
	System.out.println("Problem in accessing the array");
}
System.out.println("Exiting the main normally");
	}

}
