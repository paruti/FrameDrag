package org.task2;

public class PRSBank extends ICICIBank {
	
	public void fixedDeposit(int i) {
System.out.println("7.5% of interest "+i);
	}
	private void personal() {
System.out.println("7% of interest");
	}
public static void main(String[] args) {
	PRSBank p = new PRSBank();
	p.fixedDeposit(50000);
	p.personal();
	p.savings();
	p.loan();
	
}
}
