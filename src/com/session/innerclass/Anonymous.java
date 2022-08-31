package com.session.innerclass;

class Polygon {
	public void display() {
		System.out.println("Inside the Polygon class");
	}

	public void tv() {
		// TODO Auto-generated method stub

		System.out.println("Inside Tv");
	}

}

class AnonymousDemo {
	public void createClass() {

		System.out.println("inside anonmous");

		// creation of anonymous class extending class Polygon
		Polygon p1 = new Polygon() {
			public void display() {
				System.out.println("p1 Inside an anonymous class.");
			}

			public void tv() {
				System.out.println("inside Tv");
			}

		};
		p1.display();
		p1.tv();

		Polygon p2 = new Polygon();
		p2.display();

	}
}

public class Anonymous {

	public static void main(String[] args) {
		AnonymousDemo an = new AnonymousDemo();
		an.createClass();

	}
}
