package com.java8.exp2;

import java.util.*;

public class Student {
	private String name;
	private Set<String> book;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getBook() {
		return book;
	}
	public void setBook(Set<String> book) {
		this.book = book;
	}
	
	public void addBook(String book)
	{
		if(this.book==null)
		{
			this.book=new HashSet<>();
			
		}
		this.book.add(book);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", book=" + book + "]";
	}

	
	
	
}
