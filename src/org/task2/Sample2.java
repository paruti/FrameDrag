package org.task2;

public class Sample2 {
	public Sample2() {
		
		System.out.println("Parent default const");
	}
public Sample2(int id) {
	this();
	System.out.println("Parent Int para const "+id);
}
}
