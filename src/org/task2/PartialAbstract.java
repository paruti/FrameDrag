package org.task2;

public class PartialAbstract extends AbstractClass {

	@Override
	public void axis() {
		System.out.println("AXIS");
	}

	@Override
	public void hdfc() {
		System.out.println("HDFC");
	}

	@Override
	public void sbi() {
		System.out.println("SBI");
	}

	public static void main(String[] args) {
		PartialAbstract pa = new PartialAbstract();
		pa.axis();
		pa.hdfc();
		pa.sbi();
		pa.iciciBank();
	}
}
