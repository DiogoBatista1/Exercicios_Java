package Entities;

import Exceptions.BusinessExceptions;

public class Account {
	private Double number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Double Number, String holder, Double balance, Double withdrawLimit) {
		this.number = Number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Double getNumber() {
		return number;
	}

	public void setNumber(Double Number) {
		this.number = Number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}


	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public double deposit(Double amount) {
		return balance += amount;
	}
	
	public double withdraw(Double amount) {
		validateWithdraw(amount);
		return balance -= amount;
	}
	
	public void validateWithdraw(double amount) {
		if(amount > getWithdrawLimit()) {
			throw new BusinessExceptions("Erro de saque: A quantia excede o limite de saque");
		}
		if (amount > getBalance()) {
			throw new BusinessExceptions("Erro de saque: Saldo insuficiente");
		}
	}
}
