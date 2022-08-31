package com.session.oops;

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add1(int a, int b) {
		return a + b;
	}
	void add(int b, String  s) {
	
	}

}

public class methodoverloading {

	public static void main(String[] args) {

		System.out.println(Adder.add(1, 1));
		System.out.println(Adder.add1(1, 1));
	}

}
