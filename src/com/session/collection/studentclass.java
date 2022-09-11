package com.session.collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class studentclass implements Comparable<studentclass> {

	int id;
	String name;
	int rank;

	public studentclass(int id, String name, int rank) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getRank() {
		return rank;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "studentclass [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}

	@Override
	public int compareTo(studentclass s) {
		// TODO Auto-generated method stub
		if (rank == s.rank)
			return 0;
		else if (rank > s.rank)
			return 1;
		else
			return -1;

	}

	public static void main(String[] args) {

		ArrayList<studentclass> q = new ArrayList<studentclass>();

		studentclass s1 = new studentclass(1, "Sachin", 3);
		studentclass s2 = new studentclass(2, "Kohli", 1);
		studentclass s3 = new studentclass(3, "williamson", 3);
		studentclass s4 = new studentclass(5, "ABD", 1);
		studentclass s5 = new studentclass(4, "Smith", 5);

		q.add(s5);
		q.add(s1);
		q.add(s2);
		q.add(s3);
		q.add(s4);
		Collections.sort(q);

		Iterator itr1 = q.iterator();

		while (itr1.hasNext()) {
			studentclass st = (studentclass) itr1.next();
			System.out.println(st.id + " " + st.name + " " + st.rank);

		}
		System.out.println("========================");

		Collections.sort(q, new idcomparatorexample());
		Iterator itr2 = q.iterator();

		while (itr2.hasNext()) {
			studentclass st = (studentclass) itr2.next();
			System.out.println(st.id + " " + st.name + " " + st.rank);

		}

	}

}
