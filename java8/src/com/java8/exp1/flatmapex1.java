package com.java8.exp1;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatmapex1 {

	public static void main(String[] args) {
		String s1[][] = { { "a", "b" }, { "c", "d" }, { "e", "f" } };
		Stream<String[]> s11 = Arrays.stream(s1);// {"a","b","c","d","e","f"}
		// s11.peek(p->System.out.println("res : "+p)).forEach(System.out::print);
		// Stream<String> s111 = s11.flatMap(x -> Arrays.stream(x));
		// s111.map(String::toUpperCase).forEach(System.out::print);

		List<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");

		Set<String> sc[] = new HashSet[1];
		sc[0] = new HashSet<>(al);

		Stream<Set<String>> s = Arrays.stream(sc);

		//s.filter(r -> (r.iterator().hasNext())).collect(Collectors.toSet()).forEach(System.out::print);

		
		
		Stream<String> ss1=s.flatMap(ss->ss.stream());
		ss1.map(String::toUpperCase).forEach(System.out::print);
		
	}

}
