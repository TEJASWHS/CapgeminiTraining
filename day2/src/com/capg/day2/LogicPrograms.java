package com.capg.day2;
import java.util.*;
public class LogicPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the principal amount,time and rate of interest\n");
		 float P=sc.nextFloat();
		 float T=sc.nextFloat();
		 float R=sc.nextFloat();
		
	        float SI = (P * T * R) / 100;
	        System.out.println("Simple interest = " + SI);

	}

}
