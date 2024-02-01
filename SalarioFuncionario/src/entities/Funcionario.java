package entities;

public class Funcionario {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary(double porcento) {
		return grossSalary += grossSalary * (porcento / 100);
	}
	
	public String finalSalary() {
		return name + ", $" + String.format("%.2f", netSalary());
	}
}
