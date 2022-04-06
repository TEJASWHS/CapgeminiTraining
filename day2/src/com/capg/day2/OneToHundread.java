package com.capg.day2;

public class OneToHundread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Odd numbers starts from here");
int n=100;
for(int i=1;i<=n;i++) {
if(i%2==0) {
	System.out.println(i);
}
	}

System.out.println("Odd numbers starts from here\n");

for(int i=1;i<=n;i++) {
if(i%2!=0) {
	System.out.println(i);
}
	}


//Java Program to Find Sum of Natural Numbers

//The positive integers 1, 2, 3, 4 etc. are known as natural numbers
int num=10,sum=0;
for(int j=1;j<=num;j++)
{
    sum = sum + j;
   
}

System.out.println("Sum of first 10 natural numbers is: "+ sum);

	}
}
