package com.session.constructor;

class copyconstructor {

	private String name;
	private int id;

	public copyconstructor(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public copyconstructor(copyconstructor c) {

		this.name = c.name;
		this.id = c.id;
	}


	 @Override 
	 public String toString() { return "copyconstructor [name=" + name +
       ", id=" + id + "]"; }

}

public class copyconstructorexample {

	public static void main(String[] args) {

		copyconstructor obj1 = new copyconstructor("Gowtham", 0);
		System.out.println("object1 value is " + obj1 + "hashcode is " + obj1.hashCode());
		copyconstructor obj2 = new copyconstructor(obj1);
		System.out.println("object2 " + obj2 + "hashcode is " + obj2.hashCode());

	}

}
