package com.capg.day4;

public class BodmasCalculation implements Adding, subtracting {

	@Override
	public void sub() {
		System.out.println("\nHello welcome to Subtraction");
		int a,b,c;
		a=190;b=150;
		c=a-b;
		System.out.println("\nThe result of subtraction is "+ c);
		// TODO Auto-generated method stub

	}

	@Override
	public void add() {
		System.out.println("\nHello welcome to Addition");
		int a,b,c;
		a=19;b=60;
		c=a+b;
		System.out.println("\nThe result of Addition is "+ c);
		
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BodmasCalculation b= new BodmasCalculation();
b.add();
b.sub();
	}

}
