package com.capg.day3;
import java.util.Scanner;
import java.io.IOException;

	class InvalidAgeException  extends Exception  
		{  
		    public InvalidAgeException (String str)  
		    {  
		        // calling the constructor of parent Exception  
		        super(str);  
		    }  
		}  
		    
		// class that uses custom exception InvalidAgeException  
		public class MyExcep4  
		{  
		  
		    // method to check the age  
		    static void validate (int age) throws InvalidAgeException{    
		       if(age < 18){  
		  
		        // throw an object of user defined exception  
		        throw new InvalidAgeException("AGE IS LESS THAN 18");    
		    }  
		       else {   
		        System.out.println("welcome to vote");   
		        }   
		     }    
		  
		    // main method  
		    public static void main(String args[])  
		    { 
		    	Scanner sc=new Scanner(System.in);
		        try  
		        {  
		        	int age=sc.nextInt();
		            // calling the method   
		            validate(age);  
		        }  
		        catch (InvalidAgeException ex)  
		        {  
		            System.out.println("Caught the exception");  
		    
		            // printing the message from InvalidAgeException object  
		            System.out.println("Exception occured: " + ex);  
		        }  
		  
		        System.out.println("Code exiting");    
		    }  

}


