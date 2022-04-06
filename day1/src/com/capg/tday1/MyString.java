package com.capg.tday1;
import java.util.Scanner;

public class MyString {
	
public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
System.out.println("Enter the s1 and s2 values to check by camparing 2 strings,wheather string is equal,greater or smaller");

String s1=sc.nextLine();
String s2=sc.next();


System.out.println("\n"+s1.compareTo(s2));

	System.out.println("\n"+s1.concat(s2));
	System.out.println("\n"+s1.contains("ej"));
	System.out.println("\n"+s1.length());
	System.out.println("\n"+s1.charAt(5));
	System.out.println("\n"+s1.indexOf("i"));
	System.out.println("\n"+s1.lastIndexOf(10));
	System.out.println("\n"+s1.substring(8));
	System.out.println("\n"+s1.substring(0,11));
	System.out.println("\n"+s1.toLowerCase());
	System.out.println("\n"+s1.toUpperCase());
	System.out.println("\n"+s1.subSequence(1,9));
	System.out.println("\n"+s1.codePointCount(0,8));
	System.out.println("\n"+s1.isEmpty());
	System.out.println("\n"+s1.trim());
	System.out.println("\n"+s1.replace("T","A"));
	
	
	
}

}
