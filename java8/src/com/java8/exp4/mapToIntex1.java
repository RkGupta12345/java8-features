package com.java8.exp4;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class mapToIntex1 {

	public static void main(String[] args) {
		
		List<String> numbers=Arrays.asList("10","20","30","45","17","13");
		numbers.stream().mapToInt(no->Integer.parseInt(no)).filter(no->no%2==0).forEach(System.out::println);
		System.out.println("-----------------------------------------------------------------------");
		numbers.stream().map(no->Integer.parseInt(no)).filter(no->no%2==0).forEach(System.out::println);
		System.out.println("-----------------------------------------------------------------------");
		numbers.stream().sorted().forEach(System.out::println);
		
		System.out.println("-----------------------------------------------------------------------");
		numbers.stream().map(no->Integer.parseInt(no)).sorted((no1,no2)->(no2.compareTo(no1))).forEach(System.out::println);
		System.out.println("-----------------------------------------------------------------------");
		numbers.stream().map(no->Integer.parseInt(no)).min((no1,no2)->(no2.compareTo(no1))).ifPresent(System.out::println);
		System.out.println("-----------------------------------------------------------------------");
		numbers.stream().map(no->Integer.parseInt(no)).max((no1,no2)->(no2.compareTo(no1))).ifPresent(System.out::println);
		System.out.println("-----------------------------------------------------------------------");
		numbers.stream().map(no->Integer.parseInt(no)).reduce((no1,no2)->(no1+no2)).ifPresent(System.out::println);
		System.out.println("-----------------------------------------------------------------------");
		Double d=numbers.stream().map(no->Integer.parseInt(no)).collect(Collectors.averagingInt(no->(no))).doubleValue();
		System.out.println(d);
	
	}

}
