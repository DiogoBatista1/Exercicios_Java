import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		System.out.println("Name: ");
		func.name = sc.nextLine();
		System.out.println("GrossSalary: ");
		func.grossSalary = sc.nextDouble();
		System.out.println("tax: ");
		func.tax  = sc.nextDouble();
		
		System.out.println("Employee: "+func.name + ", " + func.netSalary());
		System.out.println("Which percentage to increase salary?");
		double porcento = sc.nextDouble();
		func.increaseSalary(porcento);
		
		System.out.println("Updated data: " + func.finalSalary());
		
		sc.close();
	}

}