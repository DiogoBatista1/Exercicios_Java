package Entities;

public class Account {
	private Double Integer;
	private String Holder;
	private Double Balance;
	private Double withdrawLimit;
	
	public Account(Double integer, String holder, Double balace, Double withdrawLimit) {
		Integer = integer;
		Holder = holder;
		Double Balace = balace;
		this.withdrawLimit = withdrawLimit;
	}

	public Double getInteger() {
		return Integer;
	}

	public void setInteger(Double integer) {
		Integer = integer;
	}

	public String getHolder() {
		return Holder;
	}

	public void setHolder(String holder) {
		Holder = holder;
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
		return Balance + amount;
	}
	
	public double withdraw(Double amount) {
		return Balance - amount;
	}
}
