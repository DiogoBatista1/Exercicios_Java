package entities;

public class Account {
	public String name;
	public double accountNumber;
	public double balance;
	public String theresDeposit;
	
	public String getName() {
		return name;
	}
	public double getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	
	public Account(String name, double accNumber, double iniDeposit) {
		this.name = name;
		this.accountNumber = accNumber;
		depositAcc(iniDeposit);
		}
	
	public void depositAcc(double deposit) {
		this.balance += deposit;
	}
	
	public void withdraw(double value) {
		this.balance -= value + 5;
	}
}
