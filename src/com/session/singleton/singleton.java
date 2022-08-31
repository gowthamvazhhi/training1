package com.session.singleton;

class Singleton {

	private static Singleton single_instance = null;

	public String s;

	private Singleton() {
		s = "Hello I am a string part of Singleton class";
	}

	public static Singleton Singleton() {

		if (single_instance == null) {
			single_instance = new Singleton();
		}
		return single_instance;
	}
	
	class doubleton{
		
	}
}

class GFG {

	public static void main(String args[]) {
		
		Singleton x = Singleton.Singleton();

		Singleton y = Singleton.Singleton();

		Singleton z = Singleton.Singleton();

		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		System.out.println(z.hashCode());

		x.s = (x.s).toUpperCase();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
		System.out.println("\n");

		z.s = (z.s).toLowerCase();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
	}
}
