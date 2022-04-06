package com.capg.day3;
import java.io.IOException;
import java.util.*;
 
class EnterOddException extends Exception{
	EnterOddException(String msg){
		super(msg);
	}
}
public class OddException {
	public static void main(String[] args) throws EnterOddException {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Hello,Enter the value to check odd or not");
int a=sc.nextInt();
System.out.println("So the number you entered is "+a);
if(a%2!=0) 
	System.out.println("And the entered number is ODD");

else
	System.out.println("And the entered number is NOT ODD");
	}

}
