package Entities;

public class Account {
	private Double Number;
	private String Holder;
	private Double Balance;
	private Double withdrawLimit;
	
	public Account(Double Number, String holder, Double balance, Double withdrawLimit) {
		this.Number = Number;
		this.Holder = holder;
		this.Balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Double getNumber() {
		return Number;
	}

	public void setNumber(Double Number) {
		this.Number = Number;
	}

	public String getHolder() {
		return Holder;
	}

	public void setHolder(String holder) {
		this.Holder = holder;
	}

	public Double getBalance() {
		return Balance;
	}


	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public double Deposit(Double amount) {
		return Balance += amount;
	}
	
	public double withdraw(Double amount) {
		return Balance -= amount;
	}
}
