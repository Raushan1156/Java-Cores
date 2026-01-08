package com.github.raushan1156.bank_system.bank;

public class BankDetails {

	String name;
	String nickName;
	static int numberOfAccounts;
	private int accountNumber;
	String ifsc;
	final static String bankName = "SBI";
	double balance;
	double depositBalance;
	double withdrawBalance;

	// if account holder don't want to pass the nickName
	public BankDetails(String name, String ifsc) {
		this.name = name;
		this.ifsc = ifsc;
		numberOfAccounts++;
		accountNumber = numberOfAccounts;
	}

	// if account holder want to give the nickName
	public BankDetails(String name, String nickName, String ifsc) {
		this.name = name;
		this.nickName = nickName;
		this.ifsc = ifsc;
		numberOfAccounts++;
		accountNumber = numberOfAccounts;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public double depositBalance(double depositBalance) {
		this.balance+=depositBalance;
		return this.balance;
	}
	
	public double withdrawBalance(double withdrawBalance) {
		this.balance-=withdrawBalance;
		return this.balance;
	}

	@Override
	public String toString() {
		return "BankDetails [name=" + name + ", nickName=" + nickName + ", accountNumber=" + accountNumber + ", ifsc="
				+ ifsc + ", balance=" + balance + "]";
	}

}
