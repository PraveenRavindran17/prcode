package org.bank;

public class BankInfo extends AxisBank {
	private void saving() {
		System.out.println("Saving Acc Bal is 0000");

	}
	private void fixed() {
		System.out.println("Fixed Acc Bal is 0000");

	}
	public static void main(String[] args) {
		BankInfo e = new BankInfo();
		e.saving();
		e.fixed();
		e.deposit();
	}

}
