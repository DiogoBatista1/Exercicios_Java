package entities;

public class Account {
	public String name;
	public double accountNumber;
	public double initialDeposit;
	public String theresDeposit;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getInitialDeposit() {
		return initialDeposit;
	}
	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	
	public void account(String name, double accNumber, double iniDeposit) {
		name = getName();
		accNumber = getAccountNumber();
		iniDeposit = getInitialDeposit();
		
		return;
	}
	
	public void depositAcc(double deposit) {
		this.initialDeposit += deposit;
		return;
	}
	
	public void withdraw(double value) {
		this.initialDeposit -= value;
		return;
	}
}
