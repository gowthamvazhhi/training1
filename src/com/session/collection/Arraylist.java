package com.session.collection;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Arraylist {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");

		// Traversing list through Iterator
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("===============");
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Vikram");
		ll.add("Thor");
		ll.add("Ironman");
		ll.add("DR strange");

		Iterator itr1 = ll.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());

		}

		System.out.println("========After sort=====");
		Collections.sort(list);
		Iterator itr2 = list.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("===============");
		Collections.sort(ll);
		Iterator itr3 = ll.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());

		}
	}
}
