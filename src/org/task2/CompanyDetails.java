package org.task2;

public class CompanyDetails {
	private void empId() {
		System.out.println("emp id is 1234");
	}

	private void empId(int id) {
		System.out.println("emp id is "+id);
	}
	private void empId(int id ,String name) {
		System.out.println("empID is "+id);
		System.out.println("Emp name is "+name);
	}
	private void empId(String name , String company) {
		System.out.println("Emp name is "+name+"\n"+"company names is "+company);
	}
	private void empId(float sal,long phno) {
		System.out.println("Emp sal is "+sal);
		System.out.println("Emp phno is "+phno);
	}
	public static void main(String[] args) {
		CompanyDetails c = new CompanyDetails();
		c.empId();
		c.empId(12954, "Rakesh");
		c.empId(18456);
		c.empId(50546.8f, 984425374l);
		c.empId("Parthi", "CTS");
		
	}
}
