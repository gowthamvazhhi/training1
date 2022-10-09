package com.session.oops;

class A {

	public int add(int a, int b) {

		return 10;
	}

}

class c extends A {

	public int add(int a, int b, int c) {

		return 11;
	}
}

public class methodOverrideingexample {

	public static void main(String[] args) {

		A add = new c();
		add.add(1, 10);
		System.out.println(add.add(1, 10));

	}
}
