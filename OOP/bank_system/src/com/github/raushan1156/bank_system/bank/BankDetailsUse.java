package com.github.raushan1156.bank_system.bank;

public class BankDetailsUse {

	public static void main(String[] args) {
		
		BankDetails bankDetails=new BankDetails("Raushan","Kumar","SBI001");
		bankDetails.depositBalance(1000);
		System.out.println(bankDetails);

	}

}
