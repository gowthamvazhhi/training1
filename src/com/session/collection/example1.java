package com.session.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class example1 {

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
			ll.add("Vikram");
			Vector<Integer> v = new Vector<Integer>();
			

			Iterator itr1 = ll.iterator();
			while (itr1.hasNext()) {
				System.out.println(itr1.next());

			}
		

	}
}
