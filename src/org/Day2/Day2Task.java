package org.Day2;

public class Day2Task {
	
	
	public static void main(String[] args) {
		
		String s="12a";
		int j=13;
		try {
		int i = Integer.parseInt(s);
		
		System.out.println(i+12);
		}catch(Exception e) {
			
			System.out.println("string shouldn't contain any alphabets");
		}
		System.out.println(j+12);
		
	}

}
