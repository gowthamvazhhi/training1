package com.session.oops;

//Interface declaration: by first user  
interface Drawable {
	void draw();
	 default void show() {
	      System.out.println("In Java 8- default method - DefaultStaticExampleInterface");
	   }
	   static void display() {
	      System.out.println("In DefaultStaticExampleInterface I");
	   }
}

interface drawing {
	void draw();
}

//Implementation: by second user  
class Rectangle implements Drawable, drawing {
	static int x = 10;

	public void draw() {
		System.out.println("drawing rectangle");
	}

}

class Circle implements Drawable {
	public void draw() {
		System.out.println("drawing circle");
	}
}

//Using interface: by third user  
class TestInterface1 {
	public static void main(String args[]) {
		Drawable d = new Circle();// In real scenario, object is provided by method e.g. getDrawable()
		d.draw();
		
		Drawable e = new Rectangle();
		e.draw();
		Rectangle f = new Rectangle();
		
	}
}