package com.session.collection;

import java.util.Map;
import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "Gowtham");
		map.put(3, "Kohli");
		map.put(4, "sachin");
		map.put(2, "Gowtham");
		System.out.println("Before invoking remove() method");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
