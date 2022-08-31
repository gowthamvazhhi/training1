package com.session.constructor;

class chainconstructorbaseclass {
	String java;

	chainconstructorbaseclass() {
		System.out.println("Default constructor at base class");
	}

	public chainconstructorbaseclass(String java) {
		this();
		this.java = java;
		System.out.println("Parametrized constructor at base class");
	}

}

public class chaininconstructorpractice extends chainconstructorbaseclass {

	String place;
	int pincode;

	public chaininconstructorpractice() {
		this("pdt", 631208);
		System.out.println("Default constructor at child class");
	}

	public chaininconstructorpractice(String place, int pincode) {
		super("java");
		this.place = place;
		this.pincode = pincode;
		System.out.println("paremetrized constructor at child class");
	}

}
//7,13,32,25