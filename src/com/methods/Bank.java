package com.methods;

public class Bank {

	static int currentBalance = 1000;
	
	public static void greetCustomer() {
		System.out.println("Hello, Welcome to banking application . . .");
	}

	public void deposit(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("Deposit sucessfull : "+ currentBalance);

	}

	public static void withdrawal(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("Withdrawl sucessfull : "+ currentBalance);
	}

	public int getCurrentBal() {
		return currentBalance;
	}

	public static void main(String[] args) {

		Bank bank = new Bank();
		greetCustomer();
		bank.deposit(500);
		withdrawal(200);
		System.out.println("Current Balance is : "+bank.getCurrentBal());
		

	}

}
