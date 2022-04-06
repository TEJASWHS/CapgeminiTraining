package com.capg.day5;

class notes {
	private int pages;

	public void setData(int x) {
		if (x > 0) {
			pages = x;
		}
	}

	public int getData() {
		// TODO Auto-generated method stub
		return pages;
	}
}

public class BookApp2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		notes b1 = new notes();
		b1.setData(100);
		int m = b1.getData();
		System.out.println("number of pages " + m);

	}

}
