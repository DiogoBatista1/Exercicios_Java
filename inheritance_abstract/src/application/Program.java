package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int numPessoas = sc.nextInt();
		
		for(int i = 0; i < numPessoas; i++) {
			System.out.printf("Tax payer #%d data:%n", i);
			System.out.println("Individual or company (i/c)?");
			String personInfo = sc.next();
			
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if(personInfo.equalsIgnoreCase("i")) {
				System.out.println("Health expenditures:");
				Double healthExp = sc.nextDouble();
				
				pessoas.add(new PessoaFisica(name, anualIncome, healthExp));
			} else if(personInfo.equalsIgnoreCase("c")) {
				System.out.println("Number of employees: ");
				int employessNum = sc.nextInt();
				
				pessoas.add(new PessoaJuridica(name, anualIncome, employessNum));
			} else {
				 System.out.println("Invalid option. Please enter 'i' for individual or 'c' for company.");
	                i--;
			}
		}
		
		System.out.println("TAXES PAID");
		Double totalTaxes = 0.0;
		
		for(Pessoa pessoa : pessoas) {
			double tax = pessoa.Tax();
		    totalTaxes += tax; 
		    System.out.println(pessoa.getName() + ": $" + String.format("%.2f", tax));
		}
		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);
		
		
		sc.close();
	}

}
