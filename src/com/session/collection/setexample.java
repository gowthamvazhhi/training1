package com.session.collection;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class setexample {

	static int d = 5;
	public static void main(String[] args) {

	
		Set<String> set1 = new HashSet<>(12);
		set1.add("Gowtham");
		set1.add("Sachin");
		set1.add("kohli");
		set1.add("Ashwin");
		boolean set2 = set1.contains("Ajith");
		System.out.println(set2);
		Iterator it = set1.iterator();
		
		//-----------------
		
		Set<String> linkedset1 = new LinkedHashSet<>();
		linkedset1.add("Gowtham");
		linkedset1.add("Sachin");
		linkedset1.add("kohli");
		linkedset1.add(null);
		linkedset1.add("Ashwin");
		linkedset1.add("Sachin");
		
		linkedset1 .add(null);
		linkedset1 .add(null);
		
	
		Iterator ll = linkedset1.iterator();
		while (ll.hasNext()) {
			System.out.println(ll.next());

		}
		
		
		
		
		
		
		
		
		
		
		
		
	//--------

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> collect = list.stream().filter(x -> x >d ).collect(Collectors.toList());

		//System.out.println(collect); // [6, 7, 8, 9, 10]
	}

}
