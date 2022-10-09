package com.session.oops;

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static public int add(int a, int c, int d) {
		return c + d;
	}

}

public class methodoverloading {

	public static void main(String[] args) {

		System.out.println(Adder.add(1, 1));
		System.out.println(Adder.add(1, 1, 1));
	}

}
