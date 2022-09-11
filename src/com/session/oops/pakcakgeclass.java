package com.session.oops;

class add {

	add(){
		
	}
	
	int x = 200;
	int y = 100;

	public int addii() {

		int c = x + y;

		System.out.println("The value of c is " + c);
		return c;

	}

	  String dispaly() {
		System.out.println("inside add class");
		return "Gowtham";
	}

}

class sub {

	int x = 200;
	int y = 100;

	public int subt() {

		int c = x - y;

		return c;

	}

}

class mul {

	int x = 200;
	int y = 100;

	public int mult() {

		int c = x * y;

		return c;

	}

}

class div {

	int x = 200;
	int y = 100;

	strictfp int B() {
		float data = 10;
		return 10;
	}

	public int divi() {

		int c = x / y;

		return c;

	}

	void display() {
		System.out.println("my name is gowtham");
	}

}

public class pakcakgeclass {

	public static void main(String[] args) {

		      add       c              = new add();// object creation
		// classname referencevaribale = new classname()
		sub x = new sub();
		System.out.println("The sub is " + x.subt());
		System.out.println(c.dispaly());

		System.out.println("The sum is" + c.addii());

		mul y = new mul();
		System.out.println("The mult is " + y.mult());

		div z = new div();
		System.out.println("The div is " + z.divi());
		int s = z.B();
		System.out.println(s);
		z.display();
	}

}
