package com.capg.day4;

public class Car implements Driver, Passenger {

	@Override
	public void Pass() {
		// TODO Auto-generated method stub
		System.out.println("Hello ,i'am a passenger");
	}

	@Override
	public void driver() {
		// TODO Auto-generated method stub
		System.out.println("Hello ,i'am a driver ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.driver();
		c.Pass();
	}

}
