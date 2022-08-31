package com.session.innerclass;

class Outer {

	private int a = 30;

	public void show1() {
		System.out.println("In a nested class method");

	}

	class Inner {

		public void show() {

			System.out.println("In a nested class method");
		}
	}

	class side {
		public void show() {

			System.out.println("In a side nested class method");
		}
	}
}

public class innerclassexample {

	public static void main(String[] args) {

		Outer ou = new Outer();

		Outer.Inner in = new Outer().new Inner();

		Outer.side si = new Outer().new side();

		in.show();
		si.show();
	}

}