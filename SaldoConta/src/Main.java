import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		double accountNumber = sc.nextDouble();

		sc.nextLine(); // Consumir a quebra de linha pendente
		
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.println("Is there a initial deposit? (y/n) ");
		String theresDeposit = sc.nextLine();
		
		double initialDeposit = 0.0;
		
		if(theresDeposit.equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();
		}		
		
	    Account acc = new Account(name, accountNumber, initialDeposit);
		
		System.out.println("Account data: ");
		printAccData(acc);

		System.out.println("Enter a deposit value: ");
		double newDeposit = sc.nextDouble();
		
		acc.depositAcc(newDeposit);
		
		System.out.println("Updated account data:");
		printAccData(acc);
		
		System.out.println("Enter a Withdraw value: ");
		double newWithdraw = sc.nextDouble();
		
		acc.withdraw(newWithdraw);
		
		System.out.println("Updated account data:");
		printAccData(acc);
		
		
		sc.close();
	}
	public static void printAccData(Account acc){
        System.out.printf("Account %.0f, Holder: %s, Balance: %.2f%n", acc.getAccountNumber(), acc.getName(), acc.getBalance());
	}

}
