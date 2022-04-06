package com.capg.day2;
import java.util.Scanner;
public class VowelsConsonat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Enter the aplhabets to check the character is vowels or consonant ");
	
	char ch='u';
	
	 switch (ch) {
	    case 'a':
	    case 'e':
	    case 'i':
	    case 'o':
	    case 'u':
	      System.out.println("The char is vowel " + ch);
	      break;
	    default:
	    	System.out.println("The char is Consonant " + ch);
	      break;
	  }
	
	

	}

}
