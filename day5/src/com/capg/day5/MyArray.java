package com.capg.day5;
import java.util.Scanner;

public class MyArray {

 

    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        long[] arr1 = new long[8];
        String a[]=new String[10];
        double arr2[] = { 1, 2, 3, 4, 5,6,7,8 };
        short[] arr3 = { 100, 200, 300,400,500 };
       
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value of index " + i);  //*input values*/
            arr[i] = sc.nextInt();
        }

        for (int s = 1; s < a.length; s++) {
            System.out.println("Enter the s value of index " + s);  //*input values*/
            arr[s] = a.charAt(s);
        }
        
        for (int j = 0; j< arr1.length; j++) {
            System.out.println("Enter the value of index " + j);  //*input values*/
            arr1[j] = sc.nextInt();
        }

 

        for (int i = 0; i < arr.length; i++) {
            System.err.println("\nEnter the i value of index " + i + " is  " + arr[i]);  //*output display*/
        }

        for (int j = 0; j< arr1.length; j++) {
            System.err.println("\nEnter the  j value of index " + j + " is  " + arr1[j]);  //*output display*/
        }

        for (int k= 0; k < arr2.length; k++) {
            System.err.println("\nEnter the k value of index " + k + " is  " + arr2[k]);  //*output display*/
        }


        for (int l= 0; l < arr3.length; l++) {
            System.err.println("\nEnter the l value of index " + l + " is  " + arr3[l]);  //*output display*/
        }
        
        for (int s= 0; s< a.length; s++) {
            System.err.println("\nEnter the s value of index " + s + " is  " + a[s]);  //*output display*/
        }

    }
}

