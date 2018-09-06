package com.java8.exp2;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatmapex1 {

	public static void main(String[] args) {
		String s1[][] = { { "a", "b" }, { "c", "d" }, { "e", "f" } };
		Stream<String[]> s11 = Arrays.stream(s1);// [{"a","b","c","d","e","f"}]
		s11.flatMap(f->Arrays.stream(f)).map(String::toUpperCase).filter(p->p.equalsIgnoreCase("a")).forEach(System.out::println);

		System.out.println("------------------------------------------------------------------------");
		
		
		Student stu1= new Student();
		stu1.setName("munnaf");
		stu1.addBook("core ");
		stu1.addBook("spring boot");
		stu1.addBook("hibernate");
		
		Student stu2= new Student();
		stu2.setName("munnaf");
		stu2.addBook("core java");
		stu2.addBook("spring boot");
		stu2.addBook("hibernate");
		
		ArrayList<Student> sutlist= new ArrayList<Student>();
		sutlist.add(stu1);
		sutlist.add(stu2);
		
		Stream<Student> sofstu=sutlist.stream();
		Stream<Set<String>> sofstu1= sofstu.map(p->p.getBook());//map just stores result into stream so getBook() returns set<book>
		 Stream<String> sofstu2= sofstu1.flatMap(p->p.stream());
		 sofstu2.distinct().collect(Collectors.toList()).forEach(System.out::println);
		 
		 System.out.println("------------------------------------------------------------------------");
         //sutlist.stream().map(stu->stu.getBook().stream().filter(st1->st1.equals("hibernate"))).flatMap(m->m.sequential());
		 sutlist.stream().map(stu->stu.getBook().stream().filter(st1->st1.equals("core java"))).flatMap(m->m.sequential()).forEach(System.out::println);
		 System.out.println("------------------------------------------------------------------------");
		 sutlist.stream().filter(p->
		 {
		 	Set<String> books=p.getBook();
		 	if(books.contains("core java"))
		 		return true;
		 	else
		 		return false;
		 	
		 }
		 ).forEach(System.out::println);	
	}

}
