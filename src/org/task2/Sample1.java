package org.task2;

public class Sample1 extends Sample2 {
	public Sample1() {
	this(10);
		System.out.println("Child Default const");
	}
	public Sample1(int i) {
		this(1234.5f);
		System.out.println("Child Int Para const "+i);
		}
	public Sample1(float sal) {
		this("Parthi");
		System.out.println("Child Float para const "+sal);
		}
	public Sample1(String name) {
		super(10);
		System.out.println("Child String para const "+name);
	}
	public static void main(String[] args) {
		Sample1 s = new Sample1();
	}

}
