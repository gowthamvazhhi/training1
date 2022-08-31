package com.session.constructor;

class Demo {
//base class default constructor  
	Demo() {
		this(80, 90);
		System.out.println("Base class default constructor called");
	}

//base class parameterized constructor  
	Demo(int x, int y) {
		System.out.println("Base class parameterized constructor called");
	}
}

//derived class or child class  
class Prototype extends Demo {
//derived class default constructor  
	Prototype() {
		this("Java", "Python");
		System.out.println("Derived class default constructor called");
	}

//derived class parameterized constructor  
	Prototype(String str1, String str2) {
		super();
		System.out.println("Derived class parameterized constructor called");
	}
}

public class constructorchainingexample {

	public static void main(String args[]) {
		Prototype my_example = new Prototype();

		chaininconstructorpractice test = new chaininconstructorpractice();

	}
}
