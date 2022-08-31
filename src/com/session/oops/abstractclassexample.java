package com.session.oops;

abstract class Bike {

	int add() {
		return 5;
	}

	abstract void run();

	@Override
	public String toString() {
		return "Bike []";
	}
}

public class abstractclassexample extends Bike {
	void run() {
		System.out.println("running safely");
	}

	public static void main(String args[]) {
		Bike obj = new abstractclassexample();
		obj.run();
		
		System.out.println(obj);
	}
}