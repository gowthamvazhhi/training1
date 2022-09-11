package com.session.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class employeeclassexample implements Comparable<employeeclassexample> {

	int id;
	String name;
	int salary;

	public employeeclassexample(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "employeeclassexample [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		employeeclassexample emp1 = new employeeclassexample(1, "Rajini", 40000);
		employeeclassexample emp2 = new employeeclassexample(2, "Ajith", 40000);
		employeeclassexample emp3 = new employeeclassexample(3, "Vijay", 30000);
		employeeclassexample emp4 = new employeeclassexample(4, "Kamal", 50000);
		employeeclassexample emp5 = new employeeclassexample(5, "Surya", 5000);

		ArrayList<employeeclassexample> al = new ArrayList<employeeclassexample>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		al.add(emp5);

		TreeSet<employeeclassexample> ts = new TreeSet<employeeclassexample>();
		ts.add(emp5);
		ts.add(emp4);
		ts.add(emp3);
		ts.add(emp2);
		ts.add(emp1);
		System.out.println(ts);

		Iterator itr1 = al.iterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		Collections.sort(al);
		System.out.println("After sorting");

		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("=======Comaparator====");
		Collections.sort(al, new employclassnamecomparator());

		Iterator itr3 = al.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}

	}

	@Override
	public int compareTo(employeeclassexample o) {
		// TODO Auto-generated method stub
		if (salary == o.salary)
			return 0;
		else if (salary > o.salary)
			return 1;
		else
			return -1;

	}

}
