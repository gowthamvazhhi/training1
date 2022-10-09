package com.session.collection;

import java.util.LinkedList;
import java.util.List;

import javax.lang.model.element.Element;
import javax.swing.plaf.synth.SynthStyleFactory;

public class linkedlistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<String> ll = new LinkedList<>();
	ll .add("Gowtham");
	ll .add("Pirahadeesh");
	ll .add("Sandhiya");
	ll .add("Swathi");
	ll.add("Ranjith");
	ll.add("Gowtham");
	ll.remove("Swathi");
	for (String x: ll) {
		System.out.print(x+",");
	}

  ((LinkedList<String>) ll).pollFirst();
	System.out.println("======");
	for (String x: ll) {
		System.out.print(x+",");
	}	
  
	if (ll.contains("Pirahadeesh")) {
		System.out.println("india gonna win");
	}
	System.out.println(((LinkedList<String>) ll).element());
	System.out.println(ll.get(3));
	System.out.println(ll.indexOf(3));
	
	}

	
	
}
