package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Double accNumber = sc.nextDouble();
		System.out.print("Holder: ");
		String holder = sc.next();
		System.out.print("Initial balance:");
		Double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit:");
		Double withdrawLimit = sc.nextDouble();
		
		
		Account newAcc = new Account(accNumber, holder, initialBalance, withdrawLimit);
		
		System.out.print("\nEnter amount for withdraw: ");
		Double withdrawValue = sc.nextDouble();
		newAcc.withdraw(withdrawValue);
		
		System.out.print("New balance:" + newAcc.getBalance());
		
		sc.close();
	}
}
