
package com.capg.day5;

class Book {
	int pages;
}

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		b1.pages = 100;
		System.out.println(b1.pages);
		b1.pages = -99;
		System.out.println(b1.pages);
	}

}
