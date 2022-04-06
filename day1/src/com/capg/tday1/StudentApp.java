package com.capg.tday1;

class Student{
	private String name;
	private int age;
	void setData(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getData() {
		return name;
	}
	public int getData1() {
		return age;
	}
}


public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student();
s1.setData("Tejaswini",22);
String n=s1.getData();
int a=s1.getData1();
System.out.println("Encapsulation concept");
System.out.println("\nName is "+n);
System.out.println("\nage is "+a);
System.out.println("\nAcessed the private elements by using getData accessor");
}
	}
