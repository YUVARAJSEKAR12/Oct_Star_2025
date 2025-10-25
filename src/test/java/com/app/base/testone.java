package com.app.base;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class testone {
	
	public static void main(String[] args) {
		// first non repeated character need to print
		//stream.... Collection --
//		String s = "AiiteA";
//		Optional<Character> first = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),
//				LinkedHashMap::new, Collectors.counting()))
//		.entrySet().stream().filter(e -> e.getValue()==1)
//		.map(Map.Entry::getKey)
//		.findFirst();
//		
//		first.ifPresent(System.out::println);
		
		//bat car - 3 , ball - 4 ,apple -5
//		
//		String a [] = {"bat","ball","car","apple","Aiite"};
//		Map<Integer,List<String>> collect = Arrays.asList(a).stream()
//				.collect(Collectors.groupingBy(String::length));
//		System.out.println(collect);
	
		
//		Integer  a [] = {1,2,3,4,5,6};
//		//find the even number and square -> sum   ... -> lambda function it will reduce the line of code
//		int sum = Arrays.asList(a).stream().filter(n -> n%2==1).mapToInt(n-> n*n).sum();
//		System.out.println(sum);
//		
	//	\\d-> character, \\D- number 
		//^ -> it will print the values in the condition
		
		String a = "AA1a2s3d4r5$%^&**()f5t6yy7";
	//	String replaceAll = a.replaceAll("[^0-9]", "");
		String replaceAll = a.replaceAll("[^a-zA-Z]", "");
	//	String replaceAll = a.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(replaceAll);
		

	}

}
