package com.session.java8;

import java.util.function.Function;

public class functionexample {


	    public static void main(String[] args) {

	        Function<String, Integer> func = x -> x.length();

	        Integer apply = func.apply("kohli");   // 6

	        System.out.println(apply);

	    }

	}
