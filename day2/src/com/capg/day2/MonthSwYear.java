package com.capg.day2;
import java.util.*;
public class MonthSwYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the months you want in the year");
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		System.out.println("switch case flow starts now");
		switch(month) {
		case 1:
			System.out.println("The month is Jan");
			break;
	case 2:
		System.out.println("The month is feb");
		break;
case 3:
	System.out.println("The month is mar");
	break;
case 4:
	System.out.println("The month is April");
	break;
case 5:
	System.out.println("The month is may");
	break;
case 6:
	System.out.println("The month is June");
	break;
case 7:
	System.out.println("The month is July");
	break;
case 8:
	System.out.println("The month is August");
	break;
case 9:
	System.out.println("The month is September");
	break;
case 10:
	System.out.println("The month is October");
	break;
case 11:
	System.out.println("The month is november");
	break;
case 12:
	System.out.println("The month is december");
	break;
	
default:
	System.out.println("wrong month number");
		}
		System.out.println("Switch case flow is completed");
}
}
