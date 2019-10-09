package org.full;

public class FullAbstract implements RBI , SBI {

	@Override
	public void personalLoan() {
System.out.println("PL");		
	}

	@Override
	public void homeLoan() {
System.out.println("HL");		
	}

	@Override
	public void fixed() {
System.out.println("FI");		
	}

	@Override
	public void saving() {
System.out.println("SI");		
	}

	@Override
	public void loan() {
System.out.println("OL");		
	}
	public static void main(String[] args) {
		FullAbstract f = new FullAbstract();
		f.personalLoan();
		f.homeLoan();
		f.fixed();
		f.saving();
		f.loan();
	}

}
