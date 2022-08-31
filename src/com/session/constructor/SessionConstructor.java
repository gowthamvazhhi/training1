package com.session.constructor;

class Student { // default constructor

	int rollno;
	String name;

	void dislay() {
		System.out.println("The student No is " + rollno + " The student name is " + name);
	}
}

class employee { // paramterized Constructor
	int id;
	String name;

	public employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	void display() {
		System.out.println("The emp id is " + id + " The emp name is " + name);
	}

}

class employee2 { // constructor overloading
	int id;
	String name;
	int salary;

	public employee2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public employee2(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println("The emp id is " + id + "  emp name is " + name);
	}

	void display2() {
		System.out.println("The emp id is " + id + "  emp name is " + name + " his salary is " + salary);
	}

	@Override
	public String toString() {
		return "employee2 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class SessionConstructor {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.dislay();

		employee e1 = new employee("Gowtham", 1);
		e1.display();
		System.out.println(e1);

		employee2 e2 = new employee2(1, "sachin");
		e2.display();

		System.out.println(e2);

		employee2 e3 = new employee2(1, "kohli", 1000);
		e3.display2();
		System.out.println(e3);

	}

}
