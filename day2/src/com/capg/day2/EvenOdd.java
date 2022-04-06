package com.capg.day2;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number to check even or odd");
		int value=input.nextInt();
		if(value %2==0) {
			System.out.println("Entered number is Even");
		}
		else{
			System.out.println("Entered number is odd");

	}

}
}
