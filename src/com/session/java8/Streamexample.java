package com.session.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamexample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		Stream<Integer> stream = list.stream();
		// stream.forEach(p -> System.out.println(p));
		 
		   List<Integer> numbers = Arrays.asList(2,3,4,5,2); 
		   
		 List<Integer> numbers2 = numbers.stream().map(x->x*x).collect(Collectors.toList());
		   numbers.stream().map(x->x*x).forEach(x->System.out.println(x));
		   
		   System.out.println("==========================");
		   List<String> names= new ArrayList<>();
		   names.add("AB");
		   names.add("kohli");
		   names.add("gowtham");
		   names.add("Sachin");
		   
		   System.out.println("==========================");
		   List<String> names3 = names.stream().peek(System.out::println).map(String::toUpperCase).peek(System.out::println).collect(Collectors.toList());
		   
		   
		   boolean n = names.stream().anyMatch((s) -> s.startsWith("A"));
		   System.out.println("The count of Names with A "+n);
		   
		   List<String> names2 = names.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		   names2.stream().map(String::toLowerCase).forEach(x->System.out.println(x));
		   
		  System.out.println("==========================");
		   
		   List<Integer> number = Arrays.asList(2,3,4,5);
		   int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		  System.out.println(even);
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		
		/* Stream<Integer> randomNumbers = Stream
			      .generate(() -> (new Random()).nextInt(100));

			randomNumbers.limit(30).forEach(System.out::println);*/
	}
}
