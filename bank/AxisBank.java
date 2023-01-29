package org.bank;

public class AxisBank extends BankInfo{


	@Override
	public void deposit() {
		System.out.println("Amount has been deposited fro Axis Bank");
	}

	public static void main(String[] args) {

		AxisBank bank = new AxisBank();
		bank.deposit();

		//		Calling Left over methods from  BankInfo Class
		bank.saving();
		bank.fixed();


	}

}
